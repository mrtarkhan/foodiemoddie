package ir.drp.it.foodiemoodie.repositories;

import ir.drp.it.foodiemoodie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String userName);
    Boolean existsByUsername(String userName);
}
