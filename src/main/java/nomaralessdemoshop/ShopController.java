package nomaralessdemoshop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam(value = "id", required = false) List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping
    public List<Integer> get() {
        return basketService.getBasket();
    }
}
