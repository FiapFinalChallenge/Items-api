package items.application.controller;

import items.application.controller.contract.IItemController;
import items.application.dto.response.ItemResponse;
import items.domain.service.contract.IItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/items")
public class ItemController implements IItemController {

    private final IItemService service;

    @Override
    public List<ItemResponse> getAll() {
        return service.getAll();
    }
}
