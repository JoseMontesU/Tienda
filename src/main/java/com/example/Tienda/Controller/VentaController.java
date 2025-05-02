package com.example.Tienda.Controller;

import com.example.Tienda.Model.VentaModel;
import com.example.Tienda.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService vs;

    @GetMapping(path = "todos")
    public ArrayList<VentaModel> mostrarVentas() {
        return vs.mostrarVentas();
    }

    @GetMapping(path = "/{id}")
    public Optional<VentaModel> buscarVenta(@PathVariable("id") int id) {
        return vs.obtenerventaID(id);

    }


    @DeleteMapping(path = "/{id}")
    public String eliminar(@PathVariable("id") int id) {
        return vs.eliminarVentaPorID(id);
    }
}
