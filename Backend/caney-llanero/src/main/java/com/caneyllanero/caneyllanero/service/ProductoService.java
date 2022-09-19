package com.caneyllanero.caneyllanero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caneyllanero.caneyllanero.model.Producto;
import com.caneyllanero.caneyllanero.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    @Override
    public Producto create(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoRepo.deleteById(id);
        
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return productoRepo.findById(id);
    }
    
    

}
