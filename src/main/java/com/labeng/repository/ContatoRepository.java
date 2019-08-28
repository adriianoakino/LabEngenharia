package com.labeng.repository;


import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.labeng.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	/*@Query("SELECT c FROM Contato WHERE LOWER(c.assunto) = LOWER(:assunto)")
	public Contato findByAssunto(@Param("assunto") String assunto);*/
}
