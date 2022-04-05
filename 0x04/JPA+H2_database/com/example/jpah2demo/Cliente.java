package com.example.jpah2demo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "CLIENTE")
public class Cliente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    
    @Column (name = "IDADE", length = 50, nullable = false)
    private int idade;
    
    @Column
    private String email;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    private List<Endereco> enderecos;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    private List<Telefone> telefones;
    
    public Cliente() {
    } 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}


	@Override
	public String toString() {
		return "Cliente [getId()=" + getId() + ", getName()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getEnderecos()=" + getEnderecos() + ", getTelefones()=" + getTelefones() + "]";
	}	
    
}