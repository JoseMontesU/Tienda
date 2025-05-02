package com.example.Tienda.Model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "venta")
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venta;
    private int id_cliente;
    private int id_producto;
    private Date fecha;
    private int cantidad;
    private double total;

    public VentaModel(int id_venta, int cantidad, Date fecha, double total, int id_cliente, int id_producto) {
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
    }

    public VentaModel() {

    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
}
