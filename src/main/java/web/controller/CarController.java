package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
@RequestMapping()
public class CarController {

    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model){
        CarService service = new CarServiceImpl();
        model.addAttribute("cars",service.index(count.orElse(0)));
        return "cars";
    }
}
