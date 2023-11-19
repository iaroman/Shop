package pro.sky.TaskSpringBasket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShoppingCart {
    private List<Integer> items = new ArrayList<>();
    public void addItems(Integer[] newList) {
        for (Integer integer : newList) {
            items.add(integer);
        }
    }
    public List<Integer> showAll(){
        return items;
    }
}
