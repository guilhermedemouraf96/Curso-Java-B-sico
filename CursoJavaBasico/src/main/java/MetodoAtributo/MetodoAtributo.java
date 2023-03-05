package MetodoAtributo;

public class MetodoAtributo {

	String nome;
	int idade;

	public void digiteSuaIdade(int idade) {
		System.out.println("A idade digitada é " + idade);

	}

	public String digiteSeuNome(String nome) {
		System.out.println("O nome digitado é " + nome);
		return nome;
	}

	public void informeDados(int idade, String nome) {
		this.nome = nome;
		this.idade = idade;
		
		System.out.println("O nome cadastrado é " + this.nome + "e a idade é " + this.idade);
	}

	public void consultaDados() {

		System.out.println("O nome cadastrado foi " + this.nome + " idade cadastrada " + this.idade);

	}
}
