package com.example.Tienda.Service;

import com.example.Tienda.Model.ClienteModel;
import com.example.Tienda.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {
@Autowired
    ClienteRepository cr;

    public Optional<ClienteModel> obtenerClienteporID(int id){
    Optional<ClienteModel> c1 = cr.findById(id);
    return c1;
    }

    public ClienteModel insertarClientespor(ClienteModel clienteModel){
    ClienteModel c1 = cr.save(clienteModel);
    return c1;
    }

    public ArrayList<ClienteModel> mostrarClientes() {
        ArrayList<ClienteModel> listaCliente = (ArrayList<ClienteModel>) cr.findAll();
        return listaCliente;

    }

    public String eliminarClientePorID(int id) {
        cr.deleteById(id);
        return "El cliente fue eliminado con exito";
    }
}
