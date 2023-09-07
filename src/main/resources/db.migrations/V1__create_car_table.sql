create schema if not exist cars:

create table cars.car(
    id bigserial primary key,
    marca varchar(50) not null,
    modelo varchar(100) not null,
    cor varchar(50) not null
)