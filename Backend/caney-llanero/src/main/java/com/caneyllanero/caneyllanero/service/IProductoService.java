package com.caneyllanero.caneyllanero.service;

import java.util.List;
import java.util.Optional;

import com.caneyllanero.caneyllanero.model.Producto;

public interface IProductoService {

    List<Producto> findAll();

    Producto create(Producto producto);

    Producto update(Producto producto);

    void delete(Integer id);
    
    Optional<Producto> findById(Integer id);
    
}
