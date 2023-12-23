package CoffeShop.JPA;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    UserRepo repo;

    public void checkLogin(String login){
        return;
    }
}
