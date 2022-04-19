DROP DATABASE empresa_db;

CREATE DATABASE IF NOT EXISTS Empresa_db;
USE `Empresa_db` ;

CREATE TABLE IF NOT EXISTS Producto (
  `codProd` INT NOT NULL UNIQUE,
  `precioUnit` FLOAT NULL,
  `cantidad` INT NULL,
  `stockMin` INT NULL,
  PRIMARY KEY (`codProd`)
  );

CREATE TABLE IF NOT EXISTS Cliente (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` INT NULL UNIQUE,
  `direccion` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  PRIMARY KEY (`idCliente`)
  );

CREATE TABLE IF NOT EXISTS Vendedor (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` INT NULL UNIQUE,
  `direccion` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  `salario` FLOAT NULL,
  PRIMARY KEY (`idVendedor`)
  );

CREATE TABLE IF NOT EXISTS Venta(
  `numVenta` INT NOT NULL AUTO_INCREMENT,
  `fechaVenta` DATE NULL,
  `Total` FLOAT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Vendedor_idVendedor` INT NOT NULL,
  PRIMARY KEY (`numVenta`),
		FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `Cliente` (`idCliente`),
		FOREIGN KEY (`Vendedor_idVendedor`)
    REFERENCES `Vendedor` (`idVendedor`)
	);


CREATE TABLE IF NOT EXISTS VentaDetalle (
  `Producto_codProd` INT NOT NULL,
  `Venta_numVenta` INT NOT NULL,
		FOREIGN KEY (`Producto_codProd`)
    REFERENCES `Producto` (`codProd`),
		FOREIGN KEY (`Venta_numVenta`)
    REFERENCES `Venta` (`numVenta`)
    );
    
			/*----------EJERCICIO 1----------*/
INSERT INTO Producto VALUES (550944,128,1000,200);
INSERT INTO Producto VALUES (538493,261,1000,200);
INSERT INTO Producto VALUES (892469,189,1000,200);
INSERT INTO Producto VALUES (374988,160,1000,200);
INSERT INTO Producto VALUES (294282,310,1000,200);
INSERT INTO Producto VALUES (240933,480,1000,200);
INSERT INTO Producto VALUES (774584,178,1000,200);
INSERT INTO Producto VALUES (211784,125,1000,200);
INSERT INTO Producto VALUES (449930,80,1000,200);
INSERT INTO Producto VALUES (924655,99,1000,200);
    
    
			/*----------EJERCICIO 2----------*/    
INSERT INTO Cliente VALUES (0,'Javier','Miraflores',42865972,'Salta 1987','1978-02-05');
INSERT INTO Cliente VALUES (0,'Manuela','Gonzales',44694820,'AV.Luro 3002','1985-10-08');
INSERT INTO Cliente VALUES (0,'Agustina','Puerri',40789410,'Balcarce 2150','1980-08-15');
INSERT INTO Cliente VALUES (0,'Esteban','Pietro',30147852,'Roca 1223','1998-04-22');
INSERT INTO Cliente VALUES (0,'Lucas','Salvio',19337762,'Jujuy 27','1990-09-25');

INSERT INTO Vendedor VALUES (0,'Martina','Almeida',83383806,'Alberti 752','1972-05-25',33204 );
INSERT INTO Vendedor VALUES (0,'Lucia','Buendía',96794497,'Alvarado 1456','1982-04-02',17312 );
INSERT INTO Vendedor VALUES (0,'Merlin','Vega',17462757,'Av. Colon 2001','1976-07-21',95457 );
INSERT INTO Vendedor VALUES (0,'Juan','Hierro',94827075,'Sarmiento 4520','2000-12-30',10624 );
INSERT INTO Vendedor VALUES (0,'Facundo','Mosquera',70978636,'Saavedra 7892','1995-01-20',45987);


/*----------EJERCICIO 3----------*/   
INSERT INTO Venta VALUES (0,'2022-08-11',0,1,1);
INSERT INTO Venta VALUES (0,'2022-01-24',0,1,5);
INSERT INTO Venta VALUES (0,'2022-05-30',0,1,3);

INSERT INTO Venta VALUES (0,'2022-10-08',0,2,2);
INSERT INTO Venta VALUES (0,'2022-12-21',0,2,4);
INSERT INTO Venta VALUES (0,'2022-06-15',0,2,1);

INSERT INTO Venta VALUES (0,'2022-07-10',0,3,1);
INSERT INTO Venta VALUES (0,'2022-06-22',0,3,2);
INSERT INTO Venta VALUES (0,'2022-02-25',0,3,3);

INSERT INTO Venta VALUES (0,'2022-05-25',0,4,2);
INSERT INTO Venta VALUES (0,'2022-11-15',0,4,5);
INSERT INTO Venta VALUES (0,'2022-09-20',0,4,1);

INSERT INTO Venta VALUES (0,'2022-08-15',0,5,4);
INSERT INTO Venta VALUES (0,'2022-02-01',0,5,4);
INSERT INTO Venta VALUES (0,'2022-07-24',0,5,1);


INSERT INTO VentaDetalle() VALUES (550944,1);
INSERT INTO VentaDetalle() VALUES (892469,1);
INSERT INTO VentaDetalle() VALUES (294282,2);
INSERT INTO VentaDetalle() VALUES (294282,2);
INSERT INTO VentaDetalle() VALUES (924655,3);
INSERT INTO VentaDetalle() VALUES (449930,3);

INSERT INTO VentaDetalle VALUES (449930,4);
INSERT INTO VentaDetalle VALUES (924655,4);
INSERT INTO VentaDetalle VALUES (550944,5);
INSERT INTO VentaDetalle VALUES (892469,5);
INSERT INTO VentaDetalle VALUES (294282,6);
INSERT INTO VentaDetalle VALUES (211784,6);

INSERT INTO VentaDetalle VALUES (240933,7);
INSERT INTO VentaDetalle VALUES (294282,7);
INSERT INTO VentaDetalle VALUES (538493,8);
INSERT INTO VentaDetalle VALUES (774584,8);
INSERT INTO VentaDetalle VALUES (294282,9);
INSERT INTO VentaDetalle VALUES (892469,9);

INSERT INTO VentaDetalle VALUES (449930,10);
INSERT INTO VentaDetalle VALUES (240933,10);
INSERT INTO VentaDetalle VALUES (550944,11);
INSERT INTO VentaDetalle VALUES (294282,11);
INSERT INTO VentaDetalle VALUES (892469,12);
INSERT INTO VentaDetalle VALUES (774584,12);

INSERT INTO VentaDetalle VALUES (924655,13);
INSERT INTO VentaDetalle VALUES (240933,13);
INSERT INTO VentaDetalle VALUES (294282,14);
INSERT INTO VentaDetalle VALUES (240933,14);
INSERT INTO VentaDetalle VALUES (538493,15);
INSERT INTO VentaDetalle VALUES (774584,15);

/*----------EJERCICIO 4----------*/   

SELECT Venta.numVenta,Venta.fechaVenta,Venta.total,Venta.Vendedor_idVendedor ,Venta.Cliente_idCliente
FROM Venta Inner JOIN Cliente ON Venta.Cliente_idCliente = Cliente.idCliente WHERE Cliente.nombre LIKE "%A%";

/*----------EJERCICIO 5----------*/   
SELECT Producto.codProd,Producto.precioUnit,Producto.cantidad,Producto.stockMin
FROM Producto Inner JOIN VentaDetalle ON  Producto.codProd= VentaDetalle.Producto_codProd;

/*----------EJERCICIO 6----------*/   
SELECT Vendedor.nombre,Vendedor.apellido,Vendedor.dni,Vendedor.direccion,Vendedor.fechaNac,Vendedor.salario,Venta.total
FROM Vendedor Inner JOIN Venta ON  Vendedor.idVendedor = Venta.Vendedor_idVendedor;

/*----------EJERCICIO 6----------*/  
CREATE TRIGGER actualizarStock AFTER INSERT ON Venta

/*
select *,Venta.total from Vendedor,Venta where Venta.Vendedor_idVendedor = Vendedor.idVendedor AND Vendedor.dni = 17462757;

select * from Venta where Venta.Cliente_idCliente = Cliente.idCliente AND Cliente.nombre like '%A%';
*/

SELECT*FROM Cliente;
SELECT*FROM Vendedor;
SELECT*FROM Producto;
SELECT*FROM Venta;
SELECT*FROM VentaDetalle;