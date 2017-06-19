package cart;

import org.springframework.data.repository.CrudRepository;


public interface ItemRepository extends CrudRepository<Item, String> {

}
