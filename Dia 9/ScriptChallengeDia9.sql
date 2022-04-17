DROP DATABASE Empresa_db;
CREATE SCHEMA IF NOT EXISTS Empresa_db DEFAULT CHARACTER SET utf8 ;
USE Empresa_db ;

CREATE TABLE IF NOT EXISTS `Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` INT NULL UNIQUE,
  `direccion` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  PRIMARY KEY (`idCliente`)
  );

CREATE TABLE IF NOT EXISTS `Vendedor` (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` INT NULL UNIQUE,
  `direccion` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  `salario` VARCHAR(45) NULL,
  PRIMARY KEY (`idVendedor`)
  );

CREATE TABLE IF NOT EXISTS `Producto` (
  `codigoProd` VARCHAR(45) NOT NULL,
  `precioUnit` FLOAT NULL,
  `cantidad` INT NULL,
  `stockMin` INT NULL,
  PRIMARY KEY (`codigoProd`)
  );

CREATE TABLE IF NOT EXISTS `Venta` (
  `ventaId` INT NOT NULL AUTO_INCREMENT,
  `fechaCompra` DATE NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Vendedor_idVendedor` INT NOT NULL,
  PRIMARY KEY (`ventaId`),
		FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `Cliente` (`idCliente`),
		FOREIGN KEY (`Vendedor_idVendedor`)
    REFERENCES `Vendedor` (`idVendedor`)
    );

CREATE TABLE IF NOT EXISTS `Factura` (
  `numFactura` INT NOT NULL AUTO_INCREMENT,
  `Producto_codigoProd` VARCHAR(45) NOT NULL,
  `Venta_ventaId` INT NOT NULL,
  PRIMARY KEY (`numFactura`),
		FOREIGN KEY (`Producto_codigoProd`)
    REFERENCES `Producto` (`codigoProd`),
		FOREIGN KEY (`Venta_ventaId`)
    REFERENCES `Venta` (`ventaId`)
    );


INSERT INTO Cliente VALUES (0,'Javier','Miraflores',42865972,'Salta 1987','1978-02-05');
INSERT INTO Cliente VALUES (0,'Manuela','Gonzales',44694820,'AV.Luro 3002','1985-10-08');
INSERT INTO Cliente VALUES (0,'Agustina','Puerri',40789410,'Balcarce 2150','1980-08-15');
INSERT INTO Cliente VALUES (0,'Esteba','Pietro',30147852,'Roca 1223','1998-04-22');
INSERT INTO Cliente VALUES (0,'Lucas','Salvio',19337762,'Jujuy 27','1990-09-25');

INSERT INTO Vendedor VALUES (0,'Martina','Almeida',83383806,'Alberti 752','1972-05-25',33204 );
INSERT INTO Vendedor VALUES (0,'Lucia','Buendía',96794497,'Alvarado 1456','1982-04-02',17312 );
INSERT INTO Vendedor VALUES (0,'Merlin','Vega',17462757,'Av. Colon 2001','1976-07-21',95457 );
INSERT INTO Vendedor VALUES (0,'Juan','Hierro',94827075,'Sarmiento 4520','2000-12-30',10624 );
INSERT INTO Vendedor VALUES (0,'Facundo','Mosquera',70978636,'Saavedra 7892','1995-01-20',45987);

INSERT INTO Producto VALUES ('550944',128,1000,200);
INSERT INTO Producto VALUES ('538493',261,1000,200);
INSERT INTO Producto VALUES ('892469',189,1000,200);
INSERT INTO Producto VALUES ('374988',160,1000,200);
INSERT INTO Producto VALUES ('294282',310,1000,200);
INSERT INTO Producto VALUES ('240933',480,1000,200);
INSERT INTO Producto VALUES ('774584',178,1000,200);
INSERT INTO Producto VALUES ('211784',125,1000,200);
INSERT INTO Producto VALUES ('449930',80,1000,200);
INSERT INTO Producto VALUES ('924655',99,1000,200);


INSERT INTO Venta VALUES (0,'2022-08-11',1,1);
INSERT INTO Venta VALUES (0,'2022-01-24',1,5);
INSERT INTO Venta VALUES (0,'2022-05-30',1,3);

INSERT INTO Venta VALUES (0,'2022-10-08',2,2);
INSERT INTO Venta VALUES (0,'2022-12-21',2,4);
INSERT INTO Venta VALUES (0,'2022-06-15',2,1);

INSERT INTO Venta VALUES (0,'2022-07-10',3,1);
INSERT INTO Venta VALUES (0,'2022-06-22',3,2);
INSERT INTO Venta VALUES (0,'2022-02-25',3,3);

INSERT INTO Venta VALUES (0,'2022-05-25',4,2);
INSERT INTO Venta VALUES (0,'2022-11-15',4,5);
INSERT INTO Venta VALUES (0,'2022-09-20',4,1);

INSERT INTO Venta VALUES (0,'2022-08-15',5,4);
INSERT INTO Venta VALUES (0,'2022-02-01',5,4);
INSERT INTO Venta VALUES (0,'2022-07-24',5,1);


INSERT INTO Factura() VALUES (550944,'2097');
INSERT INTO Factura() VALUES (892469,'2097');
INSERT INTO Factura() VALUES (294282,'9741');
INSERT INTO Factura() VALUES (294282,'9741');
INSERT INTO Factura() VALUES (924655,'7643');
INSERT INTO Factura() VALUES (449930,'7643');


INSERT INTO Producto_has_Facturacion VALUES (449930,'9867');
INSERT INTO Producto_has_Facturacion VALUES (924655,'9867');
INSERT INTO Producto_has_Facturacion VALUES (550944,'5586');
INSERT INTO Producto_has_Facturacion VALUES (892469,'5586');
INSERT INTO Producto_has_Facturacion VALUES (294282,'5367');
INSERT INTO Producto_has_Facturacion VALUES (211784,'5367');

INSERT INTO Producto_has_Facturacion VALUES (240933,'8158');
INSERT INTO Producto_has_Facturacion VALUES (294282,'8158');
INSERT INTO Producto_has_Facturacion VALUES (538493,'9109');
INSERT INTO Producto_has_Facturacion VALUES (774584,'9109');
INSERT INTO Producto_has_Facturacion VALUES (294282,'468');
INSERT INTO Producto_has_Facturacion VALUES (892469,'468');

INSERT INTO Producto_has_Facturacion VALUES (449930,'5997');
INSERT INTO Producto_has_Facturacion VALUES (240933,'5997');
INSERT INTO Producto_has_Facturacion VALUES (550944,'618');
INSERT INTO Producto_has_Facturacion VALUES (294282,'618');
INSERT INTO Producto_has_Facturacion VALUES (892469,'2967');
INSERT INTO Producto_has_Facturacion VALUES (774584,'2967');

INSERT INTO Producto_has_Facturacion VALUES (924655,'8464');
INSERT INTO Producto_has_Facturacion VALUES (240933,'8464');
INSERT INTO Producto_has_Facturacion VALUES (294282,'7967');
INSERT INTO Producto_has_Facturacion VALUES (240933,'7967');
INSERT INTO Producto_has_Facturacion VALUES (538493,'1836');
INSERT INTO Producto_has_Facturacion VALUES (774584,'1836');








UPDATE Facturacion SET fechaCompra = '2022-02-25' WHERE numFactura = '468';

SELECT*FROM Cliente;
SELECT*FROM Vendedor;
SELECT*FROM Producto;
SELECT*FROM Venta;
SELECT*FROM Factura;





