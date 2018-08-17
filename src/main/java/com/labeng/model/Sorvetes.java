package com.labeng.model;


public class Sorvetes {
    
    private long id_sorvete;
    
    private String nome;
    
    private double preco;
    
    private int estoque;
    
    private int quantidade;
    
    public Sorvetes(){
	
    }
    
    public Sorvetes(String nome, double preco, int estoque, int quantidade) {
	this.nome = nome;
	this.preco = preco;
	this.estoque = estoque;
	this.quantidade=quantidade;
    }
    
    
   
    public Sorvetes(long id_sorvete, String nome, double preco, int estoque, int quantidade) {
	super();
	this.id_sorvete = id_sorvete;
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



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
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



    @Override
    public String toString() {
	return "PedidoModel [id_sorvete=" + id_sorvete + ", nome=" + nome + ", preco=" + preco + ", estoque=" + estoque
		+ ", quantidade=" + quantidade + "]";
    }

    
    
    

}
