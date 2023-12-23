package CoffeShop.JPA;

public interface UserRepo {
    CoffeeEntity findById(Long id);
    CoffeeEntity findByLogin(String login);
    CoffeeEntity findByEmail(String email);
}
