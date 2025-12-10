package kz.batyrnosquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;

    }

    public String convert(String from, String to, Double value){
        Currency coef = currencyRepository.findByFromAndTo(CurrencyName.valueOf(from), CurrencyName.valueOf(to));
        return String.valueOf(value * coef.getValue());
    }

    public String createCoef(String from, String to, Double coef){
        Currency coefficient = new Currency();
        coefficient.setFrom(CurrencyName.valueOf(from));
        coefficient.setTo(CurrencyName.valueOf(to));
        coefficient.setValue(coef);
        currencyRepository.save(coefficient);
        return "Coef saved";
    }

}
