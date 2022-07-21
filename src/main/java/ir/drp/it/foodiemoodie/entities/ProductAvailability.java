package ir.drp.it.foodiemoodie.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

@Entity
public class ProductAvailability extends BaseEntity {

    @ManyToOne
    private Product product;

    @ManyToOne
    private Workday workday;


    private Integer workdayId;


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
