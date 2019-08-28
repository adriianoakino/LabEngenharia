package com.labeng.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "Sorvetes")
public class Sorvetes {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_sorvete")
    private long id_sorvete;
    
    @Column(name="nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name="preco", nullable = false)
    private double preco;
    
    @Column(name="estoque", nullable = false)
    private int estoque;
    
    @Column(name="quantidade", nullable = true)
    private int quantidade;
    
    public Sorvetes() { }
    
    public Sorvetes(String nome, double preco, int estoque, int quantidade) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.estoque = estoque;
	this.quantidade = quantidade;
    }
    
    public long getId_sorvete() {
        return id_sorvete;
    }

    public void setId_sorvete(long id_sorvete) {
        this.id_sorvete = id_sorvete;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getPreco() {
        return preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

   

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Sorvetes [id_sorvete=" + id_sorvete + ", nome=" + nome + ", preco=" + preco + ", estoque=" + estoque
				+ ", quantidade=" + quantidade + "]";
	}

   
    
}
