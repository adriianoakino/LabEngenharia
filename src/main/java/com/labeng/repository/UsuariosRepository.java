package com.labeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labeng.entities.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    Usuarios findByUsername(String username);

}
