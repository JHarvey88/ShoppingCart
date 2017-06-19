package cart.electonics;


import cart.CartService;
import cart.Item;
import cart.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ElectronicsService extends CartService{

    @Autowired
    private ElectronicRepository itemRepository;



    public List<Item> getAllElectronicItems() {
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
