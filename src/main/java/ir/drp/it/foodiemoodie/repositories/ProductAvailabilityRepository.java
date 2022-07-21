package ir.drp.it.foodiemoodie.repositories;

import ir.drp.it.foodiemoodie.controllers.ProductAvailabilityController;
import ir.drp.it.foodiemoodie.entities.ProductAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductAvailabilityRepository extends JpaRepository<ProductAvailability, Integer> {

    List<ProductAvailability> findAllByWorkdayId(Integer workdayId);

}
