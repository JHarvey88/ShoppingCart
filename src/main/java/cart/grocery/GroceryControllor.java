package cart.grocery;


import cart.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GroceryControllor {

    private final String BASE = "/Cart/Groceries";
    @Autowired
    GroceriesService groceriesService;

    @RequestMapping(BASE)
    public List<Item> getAllGroceries(){
        return groceriesService.getGroceryAllItems();
    }

    @RequestMapping(BASE+"/{id}")
    public Item getItem(@PathVariable String id){
        return groceriesService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = BASE)
    public void addItem(@RequestBody Item item){
        groceriesService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = BASE + "/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable String id){
        groceriesService.updateItem(id, item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = BASE + "/{id")
    public void deleteItem(@PathVariable String id){
        groceriesService.deleteItem(id);
    }
}
