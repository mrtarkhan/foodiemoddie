package ir.drp.it.foodiemoodie.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
public class Month extends BaseEntity {

    @Column(length = 6)
    private String yearMonth;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @OneToMany
    private List<Workday> workdays;


    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Workday> getWorkdays() {
        return workdays;
    }

    public void setWorkdays(List<Workday> workdays) {
        this.workdays = workdays;
    }
}
