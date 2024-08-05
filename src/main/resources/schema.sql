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

create table countries
(
    id   serial8 primary key,
    name varchar(255) not null unique
);

create table medias
(
    id              serial8 primary key,
    type_id         int8 references types (id)          not null,
    release_year    int                                 not null,
    country_id      int8 references countries (id)      not null,
    genre_id        int8 references genres (id)         not null,
    age_category_id int8 references age_categories (id) not null,
    description     text                                not null,
    url_media       varchar(255)                        not null
);