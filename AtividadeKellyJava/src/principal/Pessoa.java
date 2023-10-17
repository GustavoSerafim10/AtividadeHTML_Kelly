package principal;

public class Pessoa {
	// Atributos da classe
	private String nome;
	private int idade;
	private char sexo;

	//
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	// Mostra os detalhes dos Seres
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
	}

	public static void main(String[] args) {
		// Exemplo de uso da classe Pessoa
		Pessoa pessoa1 = new Pessoa("João", 25, 'M');
		Pessoa pessoa2 = new Pessoa("Maria", 30, 'F');

		System.out.println("Detalhes da Pessoa 1:");
		pessoa1.exibirDetalhes();

		System.out.println("\nDetalhes da Pessoa 2:");
		pessoa2.exibirDetalhes();
	}
}
