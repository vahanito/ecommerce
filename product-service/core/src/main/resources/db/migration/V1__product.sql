CREATE TABLE IF NOT EXISTS product
(
    id          integer                  not null,
    created     timestamp with time zone not null,
    name        varchar                  not null,
    description varchar                  not null,

    primary key (id)
);

CREATE INDEX IF NOT EXISTS product_name ON product (name);

CREATE TABLE IF NOT EXISTS product_seller
(
    id      integer                  not null,
    created timestamp with time zone not null,
    name    varchar                  not null,

    primary key (id)
);

CREATE INDEX IF NOT EXISTS product_seller_name ON product (name);

CREATE TABLE IF NOT EXISTS product_pricing
(
    id         integer                  not null,
    created    timestamp with time zone not null,
    price      real                     not null,
    product_id integer                  not null,
    seller_id  integer                  not null,

    primary key (id),
    foreign key (product_id) REFERENCES product,
    foreign key (seller_id) REFERENCES product_seller
);
