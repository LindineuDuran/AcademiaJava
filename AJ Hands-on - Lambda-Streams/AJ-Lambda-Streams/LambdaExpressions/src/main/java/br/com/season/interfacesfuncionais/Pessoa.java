package br.com.season.interfacesfuncionais;

public class Pessoa {

	public String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public boolean maiorDeIdade() {
		return this.idade >= 18;
	}

	public boolean menorDeIdade() {
		return this.idade < 18;
	}
}
