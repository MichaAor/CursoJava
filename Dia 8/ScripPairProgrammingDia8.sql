CREATE SCHEMA IF NOT EXISTS Hospital  ;
USE Hospital ;

SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE IF NOT EXISTS Paciente (
  `idPaciente` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL UNIQUE,
  `obraSocial` VARCHAR(45) NULL
);

CREATE TABLE IF NOT EXISTS Consulturio(
  `idConsulturio` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `numConsultorio` INT NULL
  );

CREATE TABLE IF NOT EXISTS Doctor (
  `idDoctor` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL UNIQUE,
  `especialidad` VARCHAR(45) NULL,
  `matricula` INT NULL,
  `Consulturio_idConsulturio` INT NOT NULL,
    FOREIGN KEY (`Consulturio_idConsulturio`)
    REFERENCES Consulturio (`idConsulturio`)
    );

CREATE TABLE IF NOT EXISTS Consulta(
  `idConsulta` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `fechaConsulta` DATE NULL,
  `Paciente_idPaciente` INT NOT NULL,
  `Doctor_idDoctor` INT NOT NULL,
		FOREIGN KEY (`Paciente_idPaciente`)
    REFERENCES Paciente (`idPaciente`),
		FOREIGN KEY (`Doctor_idDoctor`)
    REFERENCES Doctor (`idDoctor`)
    );
    
CREATE TABLE IF NOT EXISTS Consulta_finalizada (
  `idConsulta_finalizada` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `fechaConsulta` DATE NULL,
  `Paciente_idPaciente` INT NOT NULL,
  `Doctor_idDoctor` INT NOT NULL,
		FOREIGN KEY (`Paciente_idPaciente`)
    REFERENCES Paciente (`idPaciente`),
		FOREIGN KEY (`Doctor_idDoctor`)
    REFERENCES Doctor (`idDoctor`)
   );
   
	INSERT INTO Paciente VALUES(0,'Pedro','Gonzales',42189375,'Osde');
    INSERT INTO Paciente VALUES(0,'Marcelo','Hernandez',43125862,'Ioma');
    INSERT INTO Paciente VALUES(0,'Maria','Petri',37895423,'');
    
    INSERT INTO Consulturio VALUES(0,1);
    INSERT INTO Consulturio VALUES(0,2);
    INSERT INTO Consulturio VALUES(0,3);
    
    INSERT INTO Doctor VALUES(0,'Agustina','Martinez',35741953,'Dermatologia',124897,1);
    INSERT INTO Doctor VALUES(0,'Fernando','Elordi',41223568,'Traumatologia',798156,2);
    INSERT INTO Doctor VALUES(0,'Lucia','Topio',38667128,'Pediatria',942115,3);
    
    select * from Paciente;
    select * from Consulturio;
    select * from Doctor;
    
    CREATE TRIGGER bdConsultasFinal AFTER 
	INSERT ON Consulta FOR EACH ROW
		INSERT INTO Consulta_finalizada(idConsulta_finalizada,fechaConsulta,Paciente_idPaciente,Doctor_idDoctor)
        VALUES (0,NEW.fechaConsulta,NEW.Paciente_idPaciente,NEW.Doctor_idDoctor);


    
    INSERT INTO Consulta VALUES(0, '2022-05-12',1,1);
    INSERT INTO Consulta VALUES(0, '2022-05-22',2,2);
    INSERT INTO Consulta VALUES(0, '2022-05-24',3,3);
    
    INSERT INTO Consulta VALUES(0, '2022-06-02',1,2);
    INSERT INTO Consulta VALUES(0, '2022-06-10',2,3);
    INSERT INTO Consulta VALUES(0, '2022-06-09',2,1);
    INSERT INTO Consulta VALUES(0, '2022-10-15',3,1);
    
    
    select * from Consulta;
    select * from Consulta_finalizada;


        

