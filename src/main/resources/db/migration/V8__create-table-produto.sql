create table produto (
    id int PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    valor_unitario decimal NOT NULL,
    disponivel BOOLEAN NOT NULL,
    restaurante_id int
)