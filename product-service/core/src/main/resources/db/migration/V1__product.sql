CREATE TABLE IF NOT EXISTS product
(
    id          uuid                     not null,
    created     timestamp with time zone not null,
    name        varchar                  not null,
    description varchar                  not null,

    primary key (id)
);

CREATE INDEX IF NOT EXISTS product_name ON product (name);

CREATE TABLE IF NOT EXISTS product_seller
(
    id      uuid                     not null,
    created timestamp with time zone not null,
    name    varchar                  not null,

    primary key (id)
);

CREATE INDEX IF NOT EXISTS product_seller_name ON product (name);

CREATE TABLE IF NOT EXISTS product_pricing
(
    id         uuid                     not null,
    created    timestamp with time zone not null,
    price      real                     not null,
    product_id uuid                     not null,
    seller_id  uuid                     not null,

    primary key (id),
    foreign key (product_id) REFERENCES product,
    foreign key (seller_id) REFERENCES product_seller
);
