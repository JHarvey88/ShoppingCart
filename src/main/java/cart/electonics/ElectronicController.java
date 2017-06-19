package cart.electonics;

import cart.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectronicController {

    @Autowired
    public ElectronicsService electronicsService;

    @RequestMapping("/Cart/Electronic")
    public List<Item> getAllElectronicItems() {
        return electronicsService.getAllElectronicItems();
    }

    @RequestMapping("/Cart/Electronic/{id}")
    public Item getItem(@PathVariable String id){
        return electronicsService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Cart/Electronic")
    public void addItem(@RequestBody Item item){
        electronicsService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Cart/Electronic/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable String id){
        electronicsService.updateItem(id, item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Cart/Electronic/{id}")
    public void deleteItem(@PathVariable String id){
        electronicsService.deleteItem(id);
    }
}
