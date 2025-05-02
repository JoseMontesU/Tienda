package com.example.Tienda.Model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "venta")
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venta;
    private int cantidad;
    private Date fecha;
    private double total;

    public VentaModel(int id_venta, int cantidad, Date fecha, double total) {
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
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
}
