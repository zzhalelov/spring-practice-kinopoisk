create table types
(
    id   serial8 primary key,
    name varchar(255) not null unique
);

create table genres
(
    id   serial8 primary key,
    name varchar(255) not null unique
);

create table age_categories
(
    id   serial8 primary key,
    name varchar(255) not null unique
);