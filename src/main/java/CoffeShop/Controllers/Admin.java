package CoffeShop.Controllers;

import CoffeShop.JPA.CoffeeEntity;
import CoffeShop.JPA.CoffeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class Admin {
    @GetMapping(value="/")
    public String adminPage() {
        return "adminPage";
    }

    @Autowired
    private CoffeeRepo repo;

    @GetMapping(value="/add/coffee")
    public String addCoffee() {
        return "addCoffee";
    }

    @PostMapping("/add/coffee")
    public String addCoffeePost(@RequestParam String name,
                                @RequestParam String brand,
                                @RequestParam Double price,
                                @RequestParam String description,
                                @RequestParam Double weight,
                                @RequestParam String category,
                                @RequestParam(required = false) boolean isSale,
                                @RequestParam String imgPath,
                                @RequestParam Double newPrice,
                                Model model) {
        CoffeeEntity coffee = new CoffeeEntity(name, brand, price, description, weight, category,isSale, imgPath, newPrice);
        System.out.println("Добавляем кофий...");
        repo.save(coffee);
        return "redirect:/catalog";
    }

}
