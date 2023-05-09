
create DATABASE tarea6;
USE tarea6;

Create TABLE cliente(
	idcliente int PRIMARY key AUTO_INCREMENT not null,
    cliafp varchar(50),
    clisistemasalud varchar(50),
    usuarios_idusuario int
);
CREATE TABLE tefefono(
    idtelefono int PRIMARY KEY AUTO_INCREMENT not null,
    telefonofijo varchar(12),
    telefonomovil varchar(12),
    usuarios_idusuario int
);
CREATE TABLE direccion(
	iddireccion int PRIMARY KEY AUTO_INCREMENT not null,
    pais varchar(10),
    region varchar(15),
    ciudad varchar(15),
    numeracion varchar(10),
    calle varchar(15),
    usuarios_idusuario int
);
CREATE TABLE capacitacion(
	idcapacitacion int PRIMARY KEY AUTO_INCREMENT NOT null,
    capfecha date,
    caphora date,
    cpalugar varchar(50),
    cliente_idcliente int,
    ubicacion_idubicacion int
);
CREATE TABLE ubicacion(
	idubicacion int PRIMARY KEY not null,
    ubicfecha date,
    ubiclugar varchar(150)
);

ALTER TABLE capacitacion
ADD CONSTRAINT fk_cliente_capacitacion FOREIGN KEY ( cliente_idcliente )
REFERENCES cliente ( idcliente );

ALTER TABLE capacitacion
ADD CONSTRAINT fk_ubicacion_capacitacion FOREIGN KEY ( ubicacion_idubicacion )
REFERENCES ubicacion ( idubicacion );


CREATE TABLE asistentes(
	idasistente int PRIMARY KEY AUTO_INCREMENT not null,
    asistnombrecompleto varchar(100),
    asisedad int,
    asistcorreo varchar(50),
    asisttelefono varchar(12),
    capacitacion_idcapacitacion int
);
ALTER TABLE asistentes
ADD CONSTRAINT fk_capacitacion_asistentes FOREIGN KEY ( capacitacion_idcapacitacion )
REFERENCES capacitacion ( idcapacitacion );


CREATE TABLE accidente(
	idaccidente int PRIMARY KEY AUTO_INCREMENT not null,
    accifecha date,
    accihora date,
    accilugar varchar(150),
    acciorigen varchar(100),
    acciconsecuencias varchar(100),
    cliente_idcliente int,
    ubicacion_idubicacion int
);

ALTER TABLE accidente
ADD CONSTRAINT fk_accidente_cliente FOREIGN KEY ( cliente_idcliente )
REFERENCES cliente ( idcliente );

ALTER TABLE accidente
ADD CONSTRAINT fk_accidente_ubicacion FOREIGN KEY ( ubicacion_idubicacion )
REFERENCES ubicacion ( idubicacion );

CREATE TABLE visita(
	idvisita int PRIMARY KEY AUTO_INCREMENT not null,
    viscomentarios varchar(250),
    cliente_idcliente int,
    ubicacion_idubicacion int
);

ALTER TABLE visita
ADD CONSTRAINT fk_visita_cliente FOREIGN KEY ( cliente_idcliente )
REFERENCES cliente ( idcliente );

ALTER TABLE visita
ADD CONSTRAINT fk_visita_ubicacion FOREIGN KEY ( ubicacion_idubicacion )
REFERENCES ubicacion ( idubicacion );

/*Fin modelo base en 3FM*/


/*Registra los usuarios regsitrados en la platforma*/
Create TABLE usuarios(
    idusuario int PRIMARY key AUTO_INCREMENT not null,
    usuario varchar(50),
    contrasena varchar(50),
	rutusuario int,
    usuprimernombre varchar(30),
    usugundonombre varchar(30),
    usuapellidopaterno varchar(50),
    usuapellidomaterno varchar(50),
    usufechanacimiento date
);


/* Creo tabla Asministrativos y la asocio a tabla usuairos*/
CREATE TABLE administrativos(
    idadministrativo INT AUTO_INCREMENT PRIMARY KEY NOT null,
    admemail varchar(80),
    admarea varchar(50),
    usuarios_idusuario int
);

ALTER TABLE administrativos
ADD CONSTRAINT fk_administrativos_usuarios FOREIGN KEY ( usuarios_idusuario )
REFERENCES usuarios ( idusuario );

/*Se crea tabla profesioanal y se asocia a la tabla usuario*/
CREATE TABLE profesionales(
    idprofesional INT AUTO_INCREMENT PRIMARY KEY NOT null,
    proftituloprofesion varchar(100),
    usuarios_idusuario int
);

ALTER TABLE profesionales
ADD CONSTRAINT fk_profesionales_usuarios FOREIGN KEY ( usuarios_idusuario )
REFERENCES usuarios ( idusuario );

ALTER TABLE cliente
ADD CONSTRAINT fk_cliente_usuarios FOREIGN KEY ( usuarios_idusuario )
REFERENCES usuarios ( idusuario );


ALTER TABLE tefefono
ADD CONSTRAINT fk_usuario_telefono FOREIGN KEY ( usuarios_idusuario )
REFERENCES usuarios ( idusuario );


ALTER TABLE direccion
ADD CONSTRAINT fk_usuario_direccion FOREIGN KEY ( usuarios_idusuario )
REFERENCES usuarios ( idusuario );

/*tabla de chequeo*/
CREATE TABLE logchequeos (
  pk_tabla int(11) NOT NULL,
  nombre_tabla varchar(50) DEFAULT NULL,
  nombre_campo varchar(20) DEFAULT NULL,
  valor_anterior varchar(100) DEFAULT NULL,
  valor_actual varchar(100) DEFAULT NULL,
  tipomovimiento varchar(10) DEFAULT NULL,
  fechamovimiento datetime DEFAULT NULL,
  id double NOT NULL,
  usuario varchar(45) NOT NULL
);

INSERT INTO usuarios(idusuario,usuario, contrasena, rutusuario, usuprimernombre, usugundonombre, usuapellidopaterno, usuapellidomaterno, usufechanacimiento)
VALUES
(2,"lore", "12345", 12345610, "lore", "aaa", "g", "a", '2000-05-01'),
(3,"caro", "abcd", 98765432, "caro", null, "García", "López", '2000-10-12');
