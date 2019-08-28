package com.labeng.services;

import java.util.List;

import com.labeng.entities.Contato;

public interface ContatoService {

	void addContato(Contato contato);
	List<Contato> findByAll();
	Contato findByAssunto(String assunto);
}
