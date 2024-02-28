package items.application.controller.contract;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IItemController {

    @GetMapping
    public List<ItemResponse> getAll();

    @GetMapping("{id}")
    public ItemResponse getById(@PathVariable Long id);

    @PostMapping
    public ItemResponse create(@RequestBody @Valid ItemRequest itemRequest);

    @PutMapping("{id}")
    public ItemResponse update(@PathVariable Long id, @RequestBody @Valid ItemRequest itemRequest);

    @PutMapping("{id}/decrease")
    void decreaseItemAmount(@PathVariable Long id, @RequestParam @NotNull int amount);

    @PutMapping("{id}/increase")
    void increaseItemAmount(@PathVariable Long id, @RequestParam @NotNull int amount);

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id);
}
