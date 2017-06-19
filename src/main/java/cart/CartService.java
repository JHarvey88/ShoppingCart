package cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
/*

    OLD ORIGINAL HARD CODED LISTS

   public List<Item> electronicsItems = new ArrayList<Item>(Arrays.asList(
            new Item("TV", 1, "New 40' TV from SONY"),
            new Item("HDMI_Cord", 3, "6 foot gold plated HDMI cord"),
            new Item("DVD", 5, "Assorted DVDs"),
            new Item("Remote_Control", 2, "SONY Universal Remote Controller with LED display")
    ));

   public     List<Item> groceryItems = new ArrayList<Item>(Arrays.asList(
           new Item("Milk", 2, "Bottle of milk"),
           new Item("Bread", 1, "Loaf of Bread"),
           new Item("Peanut butter",1,"Jar of peanut butter"),
           new Item("Chese",1,"Package of swiss cheese")
   ));*/

    @Autowired
            ItemRepository itemRepository;

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
   }

}
