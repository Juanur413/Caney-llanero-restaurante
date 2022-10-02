package com.caneyllanero.caneyllanero.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caneyllanero.caneyllanero.model.Administrador;
import com.caneyllanero.caneyllanero.repository.IAdministradorRepository;

@Service
public class AdministradorService implements IAdministradorService {

    @Autowired
    private IAdministradorRepository adminRepo;

    @Override
    public Optional<Administrador> findById(Integer id) {

        Optional<Administrador> admin = adminRepo.findById(id);
        admin.map(this::contra);
        return adminRepo.findById(id);


    }

    public String contra (Administrador contraseña) {
        return contraseña.getContraseña();
    }
    
}
