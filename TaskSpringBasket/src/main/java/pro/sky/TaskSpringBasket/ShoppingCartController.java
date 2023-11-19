package pro.sky.TaskSpringBasket;

import org.apache.catalina.util.Introspection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    public ShoppingCartController (ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping("/add")
    public void add(@RequestParam Integer[] arr){
        shoppingCartService.add(arr);
    }
    @GetMapping("/get")
    public List<Integer> get() {
        return shoppingCartService.get();
    }
}
