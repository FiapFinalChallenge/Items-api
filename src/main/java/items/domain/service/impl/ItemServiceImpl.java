package items.domain.service.impl;

import items.application.dto.response.ItemResponse;
import items.application.mapper.ItemMapper;
import items.domain.repository.ItemRepository;
import items.domain.service.contract.IItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements IItemService {

    private final ItemRepository repository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(itemMapper::convertToItemResponse)
                .toList();
    }
}
