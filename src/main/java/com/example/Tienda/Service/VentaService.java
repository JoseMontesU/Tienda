package com.example.Tienda.Service;

import com.example.Tienda.Model.ProductoModel;
import com.example.Tienda.Model.VentaModel;
import com.example.Tienda.Repository.ProductoRepository;
import com.example.Tienda.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VentaService {
    @Autowired
    VentaRepository vr;

    public Optional<VentaModel> obtenerventaID(int id){
        Optional<VentaModel> v1 = vr.findById(id);
        return v1;
    }




    public ArrayList<VentaModel> mostrarVentas() {
        ArrayList<VentaModel> listaVentas = (ArrayList<VentaModel>) vr.findAll();
        return listaVentas;

    }

    public String eliminarVentaPorID(int id) {
        vr.deleteById(id);
        return "Venta eliminada";
    }
}
