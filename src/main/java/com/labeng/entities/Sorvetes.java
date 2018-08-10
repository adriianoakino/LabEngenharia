package com.labeng.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
    
    @ManyToOne( fetch = FetchType.EAGER,cascade = CascadeType.PERSIST )
    @JoinColumn(name = "id_pedido" )
    private Pedidos 	pedido;
  
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

   
    public Pedidos getPedido() {
        return pedido;
    }

  
    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }
    
    
}
