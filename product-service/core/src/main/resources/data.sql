DELETE
FROM product_pricing;
DELETE
FROM product_seller;
DELETE
FROM product;

INSERT INTO product(id, created, name, description)
VALUES (1, now(), 'computer', 'personal pc');
INSERT INTO product(id, created, name, description)
VALUES (2, now(), 'bike', 'sport equipment');

INSERT INTO product_seller(id, created, name)
VALUES (1, now(), 'Apple');
INSERT INTO product_seller(id, created, name)
VALUES (2, now(), 'Dell');
INSERT INTO product_seller(id, created, name)
VALUES (3, now(), 'Intersport');
INSERT INTO product_seller(id, created, name)
VALUES (4, now(), 'Decathlon');

INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (5, now(), 1999.99, 1, 1);
INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (6, now(), 1599.50, 1, 2);

INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (1, now(), 1999.99, 2, 1);
INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (2, now(), 1599.50, 2, 2);
INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (3, now(), 2999.99, 2, 1);
INSERT INTO product_pricing(id, created, price, product_id, seller_id)
VALUES (4, now(), 599.50, 2, 2);