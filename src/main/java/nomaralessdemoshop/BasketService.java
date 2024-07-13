package nomaralessdemoshop;

import java.util.List;

public interface BasketService {

    void add(List<Integer> id);

    List<Integer> getBasket();
}
