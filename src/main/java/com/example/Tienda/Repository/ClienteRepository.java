package com.example.Tienda.Repository;

import com.example.Tienda.Model.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
}
