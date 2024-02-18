package items.application.dto.response;

import items.domain.enums.EItemCategory;

import java.math.BigDecimal;

public record ItemResponse(
        Long id,
        String name,
        BigDecimal price,
        EItemCategory category,
        Integer amount) {
}
