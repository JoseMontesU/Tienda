package com.example.Tienda.Model;

import jakarta.persistence.*;

@Entity
@Table(name= "producto")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    private String nombre_pro;
    private int precio_producto;
    private String tipo_producto;


    public ProductoModel(int id_producto, String nombre_pro, int precio_producto, String tipo_producto) {
        this.id_producto = id_producto;
        this.nombre_pro = nombre_pro;
        this.precio_producto = precio_producto;
        this.tipo_producto = tipo_producto;
    }
    public ProductoModel() {

    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
}