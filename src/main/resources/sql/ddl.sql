CREATE TABLE product (
  id serial primary key,
  name text,
  price numeric
);

CREATE TABLE cart (
  id serial primary key,
  product_id integer
  foreign key(product_id) references product(id)
);

CREATE TABLE warehouse (
   id serial primary key,
   product_id integer,
   count integer,
   foreign key(product_id) references product(id)
);

CREATE TABLE employee (
  id serial primary key,
  address varchar,
  phone varchar,
  department_id int integer,
  title varchar,
  pay_id int,
  foreign key(department_id) references department(id),
  foreign key (pay_id) references pay(id)
);

CREATE TABLE department (
  id serial primary key,
  description varchar,
  location varchar,
  name varchar
);

CREATE TABLE employee_department (
  id serial primary key,
  employee_id integer,
  department_id integer,
  foreign key(employee_id) references employee(id),
  foreign key(department_id) references department(id)
);

CREATE TABLE pay (
  id serial primary key,
  min_range integer,
  max_range integer,
  bonus integer
);

CREATE TABLE office (
  id serial primary key,
  address varchar
);

CREATE TABLE access (
  id serial primary key,
  access_type varchar,
  office_id integer,
  foreign key(office_id) references office(id)
);

CREATE TABLE employee_access (
  id serial primary key,
  employee_id integer,
  access_id integer,
  foreign key(employee_id) references employee(id),
  foreign key(access_id) references access(id)
);