package pro.sky.TaskSpringBasket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ShoppingCartService {
    private final ShoppingCart shoppingCart;
    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(Integer[] arr) {
        shoppingCart.addItems(arr);
    }
    public List<Integer> get() {
        return shoppingCart.showAll();
    }
}
