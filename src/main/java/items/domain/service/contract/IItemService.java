package items.domain.service.contract;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;

import java.util.List;

public interface IItemService {

    List<ItemResponse> getAll();

    ItemResponse getById(Long id);

    ItemResponse create(ItemRequest itemRequest);

    ItemResponse update(Long id, ItemRequest itemRequest);

    void deleteById(Long id);

    void decreaseItemAmount(Long id, int amount);

    void increaseItemAmount(Long id, int amount);
}
