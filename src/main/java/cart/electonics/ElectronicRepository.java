package cart.electonics;

import cart.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yte_j on 6/19/2017.
 */
public interface ElectronicRepository extends CrudRepository<Item, String> {
}
