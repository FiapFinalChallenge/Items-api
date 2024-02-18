package items.application.controller.contract;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IItemController {

    @GetMapping
    public List<ItemResponse> getAll();

    @GetMapping("{id}")
    public ItemResponse getById(@PathVariable Long id);

    @PostMapping
    public ItemResponse create(@RequestBody ItemRequest itemRequest);

    @PutMapping("{id}")
    public ItemResponse update(@PathVariable Long id, @RequestBody ItemRequest itemRequest);

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id);
}
