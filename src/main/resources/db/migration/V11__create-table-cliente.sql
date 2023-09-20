create table cliente (
    id int PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    cep TEXT NOT NULL,
    complemento TEXT NOT NULL
)