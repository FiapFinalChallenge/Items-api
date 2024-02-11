package items.application.mapper;

import items.application.dto.request.ItemRequest;
import items.application.dto.response.ItemResponse;
import items.domain.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(target = "id", source = "item.id")
    @Mapping(target = "title", source = "item.title")
    @Mapping(target = "price", source = "item.price")
    ItemResponse convertToItemResponse(Item item);

    @Mapping(target = "title", source = "itemRequest.title")
    @Mapping(target = "price", source = "itemRequest.price")
    Item convertToItem(ItemRequest itemRequest);
}
