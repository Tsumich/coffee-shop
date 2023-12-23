package CoffeShop.Controllers;

import CoffeShop.JPA.CoffeeEntity;
import CoffeShop.JPA.CoffeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

//<img th:src="@{/images/${image.id}}" alt="Image">
@Controller
public class CoffeeController {
    @Autowired
    CoffeeRepo repo;
    @GetMapping(value="/catalog")
    public String home(Model model) {
        Iterable<CoffeeEntity> coffeeList = repo.findAll();
        model.addAttribute("coffeeList", coffeeList);
        model.addAttribute("title", "Кофе у Тсуми");
        return "catalog";
    }

    @GetMapping(value = "/catalog/coffees")
    public String filterByCategory (@RequestParam("cat") String category, Model model){
        Iterable<CoffeeEntity> coffeeList = repo.findByCategory(category);
        model.addAttribute("coffeeList", coffeeList);
        model.addAttribute("title_2", category);
        model.addAttribute("title", "Растворимый кофе");
        return "catalog";
    }

    @GetMapping(value = "/catalog/coffee/{id}")
    public String filterById (@PathVariable Long id, Model model){
        CoffeeEntity coffee = repo.findById(id).orElse(null);
        model.addAttribute("coffee",coffee );
        model.addAttribute("title", coffee.getName());
        return "coffeePage";
    }
}
