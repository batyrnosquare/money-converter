Чтобы запустить проект понадобиться база данных postgresql с одной таблицей. 
CREATE TABLE coefficients (
    id bigint NOT NULL,
    from_currency varchar(255),
    to_currency varchar(255),
    coefficient double precision,
    CONSTRAINT coefficients_pkey PRIMARY KEY (id)
);

два эндпойнта:

GET  /currencyOf/{from}/{to}/{value}

POST  /coef  

ПРИМЕР тела POST запроса
{
  "from": "KZT",
  "to": "USD",
  "coef": 0.0019
}
