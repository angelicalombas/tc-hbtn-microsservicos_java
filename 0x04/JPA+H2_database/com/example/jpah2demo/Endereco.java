package com.example.jpah2demo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table (name = "ENDERECO")
public class Endereco {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
    
    @Column (name = "logradouro", nullable = false)
    private String logradouro;

    @Column (name = "endereco", nullable = false)
    private String endereco;
    
    @Column (name = "numero", nullable = false)
    private String numero;
    
    @Column (name = "bairro", nullable = false)
    private String bairro;
    
    @Column (name = "cidade", nullable = false)
    private String cidade;
    
    @Column (name = "estado", length = 2, nullable = false)
    private String estado;
    
    @ManyToOne
    @JsonProperty(access = Access.WRITE_ONLY)
    private Cliente cliente;
       
	public Endereco() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

}