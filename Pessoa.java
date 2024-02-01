package br.com.vainaweb.backendt3.interfaces;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	//COnstrutores
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
