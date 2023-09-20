create table sacola2 (
    id int PRIMARY KEY UNIQUE NOT NULL,
    cliente_id int NOT NULL,
    itens TEXT NOT NULL,
    valor_total decimal NOT NULL,
    forma_pagamento int NOT NULL,
    fechada boolean NOT NULL
)