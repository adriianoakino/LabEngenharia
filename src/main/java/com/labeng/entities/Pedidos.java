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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ID_PEDIDOS_SORVETE",
			joinColumns = { @JoinColumn(name = "id_pedido")},
			inverseJoinColumns = { @JoinColumn (name = "id_sorvete") })
    private List<Sorvetes> sorvetes;
    
  
    private String status;

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

   /* public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }*/

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [id_pedido=" + id_pedido + ", total=" + total + ", date=" + date + ", sorvetes=" + sorvetes +"]";
	}
    
    
    
}
