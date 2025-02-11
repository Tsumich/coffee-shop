package CoffeShop.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static CoffeShop.Constant.HOME;


@Controller
public class MainController {
    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("title", "Кофе у Тсуми");
        return HOME;
    }
}
