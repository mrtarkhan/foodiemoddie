package ir.drp.it.foodiemoodie.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Month extends BaseEntity {

    @OneToMany
    private List<Workday> workdays;

}
