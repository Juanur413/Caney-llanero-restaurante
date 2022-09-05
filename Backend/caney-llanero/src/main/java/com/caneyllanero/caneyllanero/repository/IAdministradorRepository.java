package com.caneyllanero.caneyllanero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.caneyllanero.caneyllanero.model.Administrador;

@Repository
public interface IAdministradorRepository extends JpaRepository <Administrador, Integer> {
}
