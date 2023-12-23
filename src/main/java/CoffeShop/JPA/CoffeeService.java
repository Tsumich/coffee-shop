package CoffeShop.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CoffeeService {
    @Autowired
    private CoffeeRepo repo;
    public void save(CoffeeEntity entity){
        repo.save(entity);
    }

}
