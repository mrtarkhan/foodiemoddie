package ir.drp.it.foodiemoodie.repositories;

import ir.drp.it.foodiemoodie.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
