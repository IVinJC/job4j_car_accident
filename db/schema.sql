CREATE TABLE accident
(
    id   serial primary key,
    name varchar(2000),
    text text,
    address varchar(2000)
);

CREATE TABLE rule
(
    id   serial primary key,
    name varchar(2000)
);

CREATE TABLE type
(
    id   serial primary key,
    name varchar(2000)
);