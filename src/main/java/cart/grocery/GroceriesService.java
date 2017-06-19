package cart.grocery;

import cart.CartService;
import cart.Item;
import cart.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class GroceriesService extends CartService{

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getGroceryAllItems(){
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;

    }

    public Item getItem(String id){
        return itemRepository.findOne(id);
            }

    public void addItem(Item item){
        itemRepository.save(item);
    }

    public void updateItem(String id, Item item){
        itemRepository.save(item);
    }

    public void deleteItem(String id){
        itemRepository.delete(id);
    }

}
