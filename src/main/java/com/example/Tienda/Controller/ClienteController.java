package com.example.Tienda.Controller;

import com.example.Tienda.Model.ClienteModel;
import com.example.Tienda.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    ClienteService cs;

    @GetMapping(path = "todos")
    public ArrayList<ClienteModel> leerClientes() {
        return cs.mostrarClientes();
    }

    @GetMapping(path = "/{id}")

    public Optional<ClienteModel> buscarCliente(@PathVariable("id") int id) {
        return cs.obtenerClienteporID(id);

    }

    @PostMapping(path = "/save")
    public ClienteModel guardarClientes(@RequestBody ClienteModel clienteModel) {
        return cs.insertarClientespor(clienteModel);

    }

    @DeleteMapping(path = "/{id}")
    public String eliminar(@PathVariable("id") int id) {
        return cs.eliminarClientePorID(id);
    }


}
