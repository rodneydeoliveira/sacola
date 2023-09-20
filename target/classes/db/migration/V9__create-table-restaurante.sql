create table restaurante (
    id int PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    cardapio TEXT,
    cep TEXT NOT NULL,
    complemento TEXT NOT NULL
)