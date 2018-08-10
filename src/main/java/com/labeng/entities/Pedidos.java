package com.labeng.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_pedido")
    private long id_pedido;
    
    @Column(name="total")
    private double total;
    
    @Column(name="data")
    private Date date;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<Sorvetes> sorvetes;
    
    @ManyToOne( fetch = FetchType.EAGER,cascade = CascadeType.PERSIST )
    @JoinColumn(name = "id_usuario" )
    private Usuarios usuario;

    public long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Sorvetes> getSorvetes() {
        return sorvetes;
    }

    public void setSorvetes(List<Sorvetes> sorvetes) {
        this.sorvetes = sorvetes;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
