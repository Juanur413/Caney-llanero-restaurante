package com.caneyllanero.caneyllanero.service;

import java.util.Optional;
import com.caneyllanero.caneyllanero.model.Administrador;

public interface IAdministradorService {
    
    Optional<Administrador> findById(Integer id); 

    String contra (Administrador contraseña);

}
