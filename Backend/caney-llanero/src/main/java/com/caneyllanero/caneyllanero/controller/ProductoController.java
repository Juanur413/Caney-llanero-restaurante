package com.caneyllanero.caneyllanero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.caneyllanero.caneyllanero.model.Producto;
import com.caneyllanero.caneyllanero.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll() { 
        return ResponseEntity.ok(productoService.findAll()); 
    }

    @PostMapping
    public ResponseEntity<Producto> create(@Validated @RequestBody Producto producto ) {
        return new ResponseEntity<>(productoService.create(producto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Producto> update(@Validated @RequestBody Producto producto){
        return  productoService.findById(producto.getId_Producto())
                .map(c -> ResponseEntity.ok(productoService.update(producto)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> delete(@PathVariable("id") Integer id_Producto){
        return  productoService.findById(id_Producto)
                .map(c -> {
                    productoService.delete(id_Producto);
                    return ResponseEntity.ok(c);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}
