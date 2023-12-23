package CoffeShop.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepo extends CrudRepository<CoffeeEntity, Long> {
    boolean existsByName(String name);
    CoffeeEntity findById(String name);
    List<CoffeeEntity> findByCategory(String category);

}