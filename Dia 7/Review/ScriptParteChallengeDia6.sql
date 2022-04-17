/*
create database facultad_db;

use facultad_db;

create table datos_personales(
	dni int not null unique,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    telefono varchar(12) not null
);*/


select * from datos_personales; 	/*para seleccionar todos*/
select dni from datos_personales;	/*para seleccionar una tabla en especifico*/
select dni,telefono from datos_personales; /*para seleccionar multiples tablas*/

insert into datos_personales values(43789642,"Jorgelio","Alfan","3887415689"); /*Ingresar datos en tabla*/

insert into datos_personales(telefono,dni,apellido,nombre) 
values("3886228842",40871022,"Martinez","Matias");  /*Sigue de arriba, ingreso datos segun el orden que yo diga"*/
