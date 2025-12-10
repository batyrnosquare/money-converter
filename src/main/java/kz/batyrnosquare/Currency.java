package kz.batyrnosquare;

import jakarta.persistence.*;

@Entity
@Table(name = "coefficients")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "from_currency")
    private CurrencyName from;
    @Enumerated(EnumType.STRING)
    @Column(name = "to_currency")
    private CurrencyName to;
    @Column(name = "coefficient")
    private Double value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CurrencyName getFrom() {
        return from;
    }

    public void setFrom(CurrencyName from) {
        this.from = from;
    }

    public CurrencyName getTo() {
        return to;
    }

    public void setTo(CurrencyName to) {
        this.to = to;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
