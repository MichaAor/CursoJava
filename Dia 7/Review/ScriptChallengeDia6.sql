CREATE DATABASE facultad_db;
USE facultad_db ;

CREATE TABLE cursos(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(45) NULL UNIQUE
  );

CREATE TABLE detailEstudents (
  idDe INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  idDp INT ,
  cursos VARCHAR(45) ,
  cursos_id INT NOT NULL,
	FOREIGN KEY (cursos_id)
	REFERENCES cursos (id)
    );

CREATE TABLE departaments(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  codigo VARCHAR(45) NULL,
  nombre VARCHAR(45) NULL UNIQUE
  );

CREATE TABLE detailTeacher (
   idDt INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   idDp INT NULL,
   departament VARCHAR(45) NULL
  );

CREATE TABLE detailService (
   idDs INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   idDp INT NULL,
   section VARCHAR(45) NULL
   );


CREATE TABLE detailEmployee (
   idDe INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   idDp INT NULL,
   aIncorp INT NULL,
   despacho INT NULL,
   detailTeacher_idDt INT NOT NULL,
   detailService_idDs INT NOT NULL,
		FOREIGN KEY (detailTeacher_idDt)
    REFERENCES  detailTeacher(idDt),
		FOREIGN KEY (detailService_idDs)
    REFERENCES detailService (idDs)
    );

CREATE TABLE section (
   id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(45) NULL,
   codigo VARCHAR(45) NULL UNIQUE
   );

CREATE TABLE pivotDepart(
   idPd INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   dni INT NULL,
   codigoDeparts VARCHAR(45) NULL,
   status INT NULL,
   departaments_id INT NOT NULL,
		FOREIGN KEY (departaments_id)
    REFERENCES departamentS (id)
    );

CREATE TABLE pivotSection(
	idPc INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	dni INT NULL,
	codigoSec VARCHAR(45) NULL,
	status INT NULL,
	section_id INT NOT NULL,
    FOREIGN KEY (section_id)
    REFERENCES section (id)
    );
    
    CREATE TABLE datosPersonales(
  idDp INT NULL AUTO_INCREMENT PRIMARY KEY,
  dni INT NULL UNIQUE,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  estadoCivil VARCHAR(45) NULL,
  type_user ENUM('estudiante', 'profesor', 'servicio') NULL,
  detallEstudents_idDe INT NOT NULL,
  detailEmployee_idDe INT NOT NULL,
  departaments_id INT NOT NULL,
  section_id INT NOT NULL,
		FOREIGN KEY (detallEstudents_idDe)
    REFERENCES detailEstudents (idDe),
		FOREIGN KEY (departaments_id)
    REFERENCES departaments (id),
		FOREIGN KEY (detailEmployee_idDe)
    REFERENCES detailEmployee (idDe),
		FOREIGN KEY (section_id)
    REFERENCES section (id)
    );
