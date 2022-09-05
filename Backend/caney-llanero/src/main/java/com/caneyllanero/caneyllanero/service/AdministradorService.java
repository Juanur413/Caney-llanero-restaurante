package com.caneyllanero.caneyllanero.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.caneyllanero.caneyllanero.model.Administrador;

public class AdministradorService implements IAdministradorService {

    @Autowired
    private IAdministradorService AdministradorService;

    @Override
    public Optional<Administrador> findByUsuario(String usuario) {
        return AdministradorService.findByUsuario(usuario);
    }
    
}
