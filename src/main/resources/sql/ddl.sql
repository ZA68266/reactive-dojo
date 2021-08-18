CREATE TABLE product (
  id integer,
  name text,
  price numeric
);

CREATE TABLE cart (
  id integer,
  product_id integer
);

CREATE TABLE warehouse (
   id integer,
   product_id integer,
   count integer
);
