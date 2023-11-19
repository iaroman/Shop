package pro.sky.TaskSpringBasket;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    private ShoppingCart shoppingCart;
    public void add(Integer[] arr) {
        shoppingCart.addItems(arr);
    }
    public List<Integer> get() {
        return shoppingCart.showAll();
    }
}
