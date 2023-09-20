create table item(
    id int PRIMARY KEY UNIQUE NOT NULL,
    produto TEXT,
    quantidade int NOT NULL,
    sacola_id int
)