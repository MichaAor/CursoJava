CREATE DATABASE IF NOT EXISTS kiosco_db;
USE kiosco_db ;

CREATE TABLE IF NOT EXISTS Cliente (
   idCliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(45) NULL,
   apellido VARCHAR(45) NULL,
   dni INT NULL UNIQUE,
   direccion VARCHAR(45) NULL,
   fechaNac DATE NULL
   );

CREATE TABLE IF NOT EXISTS Vendedor (
   idVendedor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(45) NULL,
   apellido VARCHAR(45) NULL,
   dni INT NULL UNIQUE,
   direccion VARCHAR(45) NULL,
   fechaNac DATE NULL,
   salario VARCHAR(45) NULL
	);

CREATE TABLE IF NOT EXISTS Producto(
   idProducto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   codigoProd VARCHAR(45) NULL UNIQUE,
   precioUnit FLOAT NULL,
   cantidad INT NULL,
   stockMin INT NULL
   );


CREATE TABLE IF NOT EXISTS Facturacion(
   numFactura INT NOT NULL PRIMARY KEY UNIQUE,
   fechaCompra DATE NULL,
   Cliente_idCliente INT NOT NULL,
   Vendedor_idVendedor INT NOT NULL,
   Producto_idProducto INT NOT NULL,
		FOREIGN KEY (Cliente_idCliente)
    REFERENCES Cliente(idCliente),
		FOREIGN KEY (Vendedor_idVendedor)
    REFERENCES Vendedor (idVendedor),
		FOREIGN KEY (Producto_idProducto)
    REFERENCES Producto (idProducto)
    );