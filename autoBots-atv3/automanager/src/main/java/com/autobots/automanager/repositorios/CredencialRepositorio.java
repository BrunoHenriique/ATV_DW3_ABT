package com.autobots.automanager.repositorios;

import com.autobots.automanager.entidades.CredencialUsuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CredencialRepositorio extends JpaRepository<CredencialUsuario, Long> {

}
