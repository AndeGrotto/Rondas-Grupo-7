package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Usuario implements Serializable {

	   
	@Id
	private long id;
	@Column(length = 50, unique = true, nullable = false)
	private String nome;
	@Column(length = 20, unique = true, nullable = false)
	private String login;
	@Column(length = 50, nullable = false)
	private String senha;
	
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	} 
	
	
	
	public Usuario(long id, String nome, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}



	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
   
}
