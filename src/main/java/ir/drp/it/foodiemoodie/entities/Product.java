package ir.drp.it.foodiemoodie.entities;

import javax.persistence.*;

@Entity(name = "products")
public class Product extends BaseEntity{



    @Column(length = 150)
    private String name;

    private int price;

    public Product(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
