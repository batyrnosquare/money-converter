package kz.batyrnosquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CurrencyController {

    private final CurrencyService controllerService;

    @Autowired
    public CurrencyController(CurrencyService controllerService) {
        this.controllerService = controllerService;
    }

    @GetMapping("/currencyOf/{from}/{to}/{value}")
    public String convert(@PathVariable String from, @PathVariable String to, @PathVariable Double value){
        return controllerService.convert(from, to, value);
    }

    @PostMapping("/coef")
    public String coef(@RequestBody CurrencyDTO request) {
        return controllerService.createCoef(
                request.getFrom(),
                request.getTo(),
                request.getCoef()
        );
    }


}
