package items.domain.repository;

import items.domain.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository {

    List<Item> findAll();
}
