package CoffeShop.Controllers;

import CoffeShop.JPA.CoffeeRepo;
import CoffeShop.JPA.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {
    @Autowired
    private UserService service;
    @PostMapping(value="/user/login")
    public void logIn(@RequestParam String login,
                      @RequestParam String password,
                      @RequestParam String checkPassword,
                      Model model){
        service.checkLogin(login);
        return;
    }

    @PostMapping(value="/user/login")
    public void reg(Model model){

    }
}
