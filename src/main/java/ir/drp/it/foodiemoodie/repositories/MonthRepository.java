package ir.drp.it.foodiemoodie.repositories;

import ir.drp.it.foodiemoodie.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthRepository extends JpaRepository<Month, Integer> {

    Month findByYearMonth(Integer yearmonth);

}
