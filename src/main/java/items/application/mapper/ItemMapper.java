package items.application.mapper;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;
import items.domain.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(target = "id", source = "item.id")
    @Mapping(target = "name", source = "item.name")
    @Mapping(target = "price", source = "item.price")
    @Mapping(target = "category", source = "item.category")
    @Mapping(target = "amount", source = "item.amount")
    ItemResponse convertToItemResponse(Item item);

    @Mapping(target = "name", source = "itemRequest.name")
    @Mapping(target = "price", source = "itemRequest.price")
    @Mapping(target = "category", source = "itemRequest.category")
    @Mapping(target = "amount", source = "itemRequest.amount")
    Item convertToItem(ItemRequest itemRequest);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "itemRequest.name")
    @Mapping(target = "price", source = "itemRequest.price")
    @Mapping(target = "category", source = "itemRequest.category")
    @Mapping(target = "amount", source = "itemRequest.amount")
    Item convertToItemWithId(ItemRequest itemRequest, Long id);
}
