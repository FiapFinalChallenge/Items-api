package items.application.controller.contract;

import items.application.dto.response.ItemResponse;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IItemController {

    @GetMapping
    public List<ItemResponse> getAll();
}
