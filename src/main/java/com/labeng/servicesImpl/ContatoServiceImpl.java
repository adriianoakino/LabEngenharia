package com.labeng.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labeng.entities.Contato;
import com.labeng.repository.ContatoRepository;
import com.labeng.services.ContatoService;

@Service
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository _contatoRepository;

	@Override
	public void addContato(Contato contato) {
		this._contatoRepository.save(contato);
		
	}

	@Override
	public List<Contato> findByAll() {
		// TODO Auto-generated method stub
		return this._contatoRepository.findAll();
	}

	@Override
	public Contato findByAssunto(String assunto) {
		// TODO Auto-generated method stub
		return this.findByAssunto(assunto);
	}
	
	
}
