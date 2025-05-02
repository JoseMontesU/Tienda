DROP DATABASE IF EXISTS Tienda;
CREATE DATABASE Tienda;
USE Tienda;

CREATE TABLE cliente (
    id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100),
    edad INT,
    direccion VARCHAR(100),
    PRIMARY KEY (id_cliente)
);

CREATE TABLE producto (
    id_producto INT NOT NULL AUTO_INCREMENT,
    nombre_pro VARCHAR(100),
    precio_producto DECIMAL(10, 2),
    tipo_producto VARCHAR(100),
    PRIMARY KEY (id_producto)
);

CREATE TABLE venta (
    id_venta INT NOT NULL AUTO_INCREMENT,
    id_cliente INT,
    id_producto INT,
    fecha DATE,
    cantidad INT,
    total DECIMAL,
    PRIMARY KEY (id_venta),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);
