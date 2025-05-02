package com.example.Tienda.Repository;

import com.example.Tienda.Model.VentaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<VentaModel, Integer> {
}
