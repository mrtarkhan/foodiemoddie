package ir.drp.it.foodiemoodie.entities;

import ir.drp.it.foodiemoodie.enumerations.WorkDayType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Workday extends BaseEntity {


    @Temporal(TemporalType.DATE)
    private Date workingDate;

    @Column(length = 8)
    private String workingDateJalali;

    @Enumerated(EnumType.ORDINAL)
    private WorkDayType type;

    @ManyToOne
    @JoinColumn(name = "monthId")
    private Month month;

}
