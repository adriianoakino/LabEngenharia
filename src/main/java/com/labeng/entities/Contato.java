package com.labeng.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private long id_contato;
	
	@Column(name = "assunto")
	private String assunto;
	
	@Column(name = "descricao")
	private String descricao;

	public long getId_contato() {
		return id_contato;
	}

	public void setId_contato(long id_contato) {
		this.id_contato = id_contato;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Contato [id_contato=" + id_contato + ", assunto=" + assunto + ", descricao=" + descricao + "]";
	}
	
	
}
