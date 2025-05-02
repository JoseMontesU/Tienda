package com.example.Tienda.Repository;

import com.example.Tienda.Model.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {
}
