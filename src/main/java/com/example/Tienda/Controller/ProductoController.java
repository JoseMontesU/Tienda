package com.example.Tienda.Controller;

import com.example.Tienda.Model.ClienteModel;
import com.example.Tienda.Model.ProductoModel;
import com.example.Tienda.Service.ClienteService;
import com.example.Tienda.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService ps;

    @GetMapping(path = "todos")
    public ArrayList<ProductoModel> mostrarProductos() {
        return ps.mostrarProductos();
    }
    @GetMapping(path = "/{id}")

    public Optional<ProductoModel> buscarProducto(@PathVariable("id") int id) {
        return ps.obtenerproductoporID(id);

    }

    @PostMapping(path = "/save")
    public ProductoModel guardarProductos(@RequestBody ProductoModel productoModel) {
        return ps.insertarProductospor(productoModel);

    }

    @DeleteMapping(path = "/{id}")
    public String eliminar(@PathVariable("id") int id) {
        return ps.eliminarProductoPorID(id);
    }


}
