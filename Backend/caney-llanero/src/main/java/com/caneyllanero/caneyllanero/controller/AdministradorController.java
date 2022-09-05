package com.caneyllanero.caneyllanero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caneyllanero.caneyllanero.model.Administrador;
import com.caneyllanero.caneyllanero.service.AdministradorService;

@RestController
@RequestMapping("/Login")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public ResponseEntity<Administrador> findById(@PathVariable("id") Integer Id_Documento ) { 
        return administradorService.findById(Id_Documento)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    
    }
}