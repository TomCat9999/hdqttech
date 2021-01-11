package hdqtech.main.repository;

import hdqtech.main.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelivery extends JpaRepository<Delivery,Integer> {
}
