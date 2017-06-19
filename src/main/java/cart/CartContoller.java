package cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartContoller {

    @Autowired
    CartService cartService;

    @RequestMapping("/Cart")
    public List<Item> getAllItems() {
        return cartService.getAllItems();
    }


}
