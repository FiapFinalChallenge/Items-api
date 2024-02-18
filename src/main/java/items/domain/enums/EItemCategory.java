package items.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EItemCategory {

    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    GROCERIES("Groceries"),
    HOME_GOODS("Home Goods"),
    TOYS("Toys"),
    BOOKS("Books"),
    HEALTH_AND_BEAUTY("Health & Beauty");

    private final String description;
}
