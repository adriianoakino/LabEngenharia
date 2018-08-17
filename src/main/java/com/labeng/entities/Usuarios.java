package com.labeng.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id_usuario;
    
    @Column(name="nome", nullable = false, length = 120)
    private String nome;
    
    @Column(name="username", unique = true, nullable = false, length = 100)
    private String username;
    
    @Column(name="password", nullable = false, length = 16)
    private String password;
    
    @Column(name="cep", nullable = false, length = 10)
    private String cep;
    
    @Column(name="endereco", nullable = false, length = 100)
    private String logadouro;
    
    @Column(name="numero", nullable = false, length = 8)
    private String numero;
    
    @Column(name="rua", nullable = false, length = 2)
    private String estado;
   
    @Column(name="cidade", nullable = false, length = 25)
    private String cidade;
    
    @Column(name="bairro", nullable = false, length = 50)
    private String bairro;
    
/*    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Pedidos> pedidos;*/

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   /* public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }*/

    @Override
    public String toString() {
	return "Usuarios [id_usuario=" + id_usuario + ", nome=" + nome + ", username=" + username + ", password="
		+ password + ", cep=" + cep + ", logadouro=" + logadouro + ", numero=" + numero + ", estado=" + estado
		+ ", cidade=" + cidade + ", bairro=" + bairro + ", pedidos=" + /*pedidos +*/ "]";
    }
    
    

   
}
