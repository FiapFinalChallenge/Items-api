package items.domain.repository;

import items.domain.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository {

    List<Item> findAll();

    Optional<Item> findById(Long id);

    Item save(Item item);

    void deleteById(Long id);
}
