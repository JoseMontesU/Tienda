package com.example.Tienda.Service;

import com.example.Tienda.Model.ClienteModel;
import com.example.Tienda.Model.ProductoModel;
import com.example.Tienda.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository pr;

    public Optional<ProductoModel> obtenerproductoporID(int id){
        Optional<ProductoModel> p1 = pr.findById(id);
        return p1;
    }

    public ProductoModel insertarProductospor(ProductoModel productoModel){
        System.out.println("gaaa" + productoModel.toString());
        ProductoModel p1 = pr.save(productoModel);
        return p1;

    }

    public ArrayList<ProductoModel> mostrarProductos() {
        ArrayList<ProductoModel> listaproductos = (ArrayList<ProductoModel>) pr.findAll();
        return listaproductos;

    }

    public String eliminarProductoPorID(int id) {
        pr.deleteById(id);
        return "El Producto eliminado";
    }
}
