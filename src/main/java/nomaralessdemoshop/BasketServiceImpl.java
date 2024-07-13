package nomaralessdemoshop;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Service
public class BasketServiceImpl implements BasketService {
    public List<Integer> basketArray;

    public BasketServiceImpl() {
        this.basketArray =  new ArrayList<>();
    }

    @Override
    public void add(List<Integer> id) {
        for (Integer id1 : id)
            basketArray.add(id1);
    }

    @Override
    public List<Integer> getBasket() {
        return Collections.unmodifiableList(basketArray);
    }
}
