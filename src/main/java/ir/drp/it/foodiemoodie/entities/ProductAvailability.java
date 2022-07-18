package ir.drp.it.foodiemoodie.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ProductAvailability extends BaseEntity {

    @ManyToOne
    @MapsId
    private Product product;

    @ManyToOne
    @MapsId
    private Workday workday;


    public ProductAvailability(Product product, Workday workDay) {
        this.product = product;
        this.workday = workDay;
    }

    public ProductAvailability() {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Workday getWorkDay() {
        return workday;
    }

    public void setWorkDay(Workday workDay) {
        this.workday = workDay;
    }
}
