package items.infra.repository;

import items.domain.model.Item;
import items.domain.repository.ItemRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositoryJpa extends JpaRepository<Item, Long>, ItemRepository {
}
