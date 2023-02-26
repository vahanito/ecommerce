CREATE TABLE IF NOT EXISTS product
(
    id          uuid      not null,
    created     timestamp not null,
    name        varchar   not null,
    description varchar   not null,
    primary key (id)
);

CREATE INDEX IF NOT EXISTS product_name ON product (name);