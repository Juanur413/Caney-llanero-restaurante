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
@RequestMapping(path = "/Login")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping("/{Usuario}")
    public ResponseEntity<Administrador> findByUsuario(@PathVariable("Usuario") String usuario) { 
        return administradorService.findByUsuario(usuario)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    
    }
}