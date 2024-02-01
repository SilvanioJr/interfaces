package br.com.vainaweb.backendt3.interfaces;

public class TriAtleta extends Pessoa implements Atleta {

	
	public TriAtleta() {
		super();
	}

	public TriAtleta(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public void aquecer() {
		System.out.println(getNome() + "está aquecendo.");
	}

	@Override
	public String toString() {
		return "TriAtleta [Nome: " + getNome() + ", Cpf: " + getCpf() + "]";
	}

	
}
