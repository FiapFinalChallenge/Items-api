package items.domain.service.contract;

import items.application.dto.response.ItemResponse;

import java.util.List;

public interface IItemService {

    List<ItemResponse> getAll();
}
