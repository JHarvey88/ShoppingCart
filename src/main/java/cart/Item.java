package cart;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private String name;
    private String description;
    private int quantity;

    public Item(String name, int quantity, String description){
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }
    public Item(){
        name = null;
        description = null;
        quantity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
