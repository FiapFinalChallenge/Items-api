package items.application.dto.request;

import items.domain.enums.EItemCategory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ItemRequest(
        @NotBlank String name,
        @NotNull BigDecimal price,
        @NotNull EItemCategory category,
        @NotNull Integer amount) {
}
