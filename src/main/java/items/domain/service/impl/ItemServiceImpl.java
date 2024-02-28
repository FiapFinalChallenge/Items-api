package items.domain.service.impl;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;
import items.application.mapper.ItemMapper;
import items.domain.model.Item;
import items.domain.repository.ItemRepository;
import items.domain.service.contract.IItemService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements IItemService {

    private static final String ITEM_NOT_FOUND = "Not found item ID: ";
    private final ItemRepository repository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(itemMapper::convertToItemResponse)
                .toList();
    }

    @Override
    public ItemResponse getById(Long id) {
        return itemMapper.convertToItemResponse(findById(id));
    }

    @Override
    public ItemResponse create(ItemRequest itemRequest) {
        return itemMapper.convertToItemResponse(repository
                .save(itemMapper.convertToItem(itemRequest)));
    }

    @Override
    public ItemResponse update(Long id, ItemRequest itemRequest) {
        getById(id);
        return itemMapper.convertToItemResponse(repository
                .save(itemMapper.convertToItemWithId(itemRequest, id)));
    }

    @Override
    public void deleteById(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public void decreaseItemAmount(Long id, int amount) {
        var item = findById(id);
        item.decreaseAmount(amount);
        repository.save(item);
    }

    @Override
    public void increaseItemAmount(Long id, int amount) {
        var item = findById(id);
        item.increaseAmount(amount);
        repository.save(item);
    }

    private Item findById(Long id) {
        return repository.findById(id)
              .orElseThrow(() -> new EntityNotFoundException(ITEM_NOT_FOUND + id));
    }
}
