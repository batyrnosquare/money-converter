package kz.batyrnosquare;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Currency findByFromAndTo(CurrencyName from, CurrencyName to);
}
