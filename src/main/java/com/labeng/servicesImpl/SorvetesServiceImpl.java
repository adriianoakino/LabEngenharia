package com.labeng.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labeng.entities.Sorvetes;
import com.labeng.repository.SorvetesRepository;
import com.labeng.services.SorvetesService;

@Service
public class SorvetesServiceImpl implements SorvetesService {

    @Autowired
    private SorvetesRepository _sorveteRepository;
    
    @Override
    public void addSorvete(Sorvetes sorvete) {
	this._sorveteRepository.save(sorvete);
    }

    @Override
    public void updateSorvete(Sorvetes sorvete) {
	this._sorveteRepository.save(sorvete);
    }

    @Override
    public List<Sorvetes> findByAll() {
	System.out.println(this._sorveteRepository.findAll().toString());
	return this._sorveteRepository.findAll();
    }
    
    @Override
    public void criaSorvetes() {
	criaListaPicoles();
    }

    public void criaListaPicoles() {
	
  	addSorvete(new Sorvetes("Abacaxi", 		2.00, 30));
  	addSorvete(new Sorvetes("Abacaxi ao Vinho", 	2.00, 40));
  	addSorvete(new Sorvetes("Amendoim", 		2.00, 20));
  	addSorvete(new Sorvetes("Chocolate", 		2.00, 50));
  	addSorvete(new Sorvetes("Coco Branco", 		2.00, 60));
  	addSorvete(new Sorvetes("Coco Queimado", 	2.00, 70));
  	addSorvete(new Sorvetes("Gourmet Banana", 	2.00, 60));
  	addSorvete(new Sorvetes("Goiaba ao Leite", 	2.00, 30));
  	addSorvete(new Sorvetes("Milho Verde", 		2.00, 20));
  	addSorvete(new Sorvetes("Morango Star", 	2.00, 10));
  	addSorvete(new Sorvetes("Leite Ninho", 		2.00, 10));
  	addSorvete(new Sorvetes("Torta de Limão", 	2.00, 10));
  	addSorvete(new Sorvetes("Paleta de Leite Ninho com Nutela", 	6.00, 10));
  	addSorvete(new Sorvetes("Paleta de Chocolate com Nutela", 	6.00, 10));
  	
  	
      }

    
}
