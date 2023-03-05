package ControleFluxo;

public class ElseIf {

	public static void main(String[] args) {
		
		String nome = "Clara";
		int idade = 61;
		
		if(idade>=18 && idade <60) {
			
			System.out.println("O aluno(a) " + nome + " é adulto" );
			
		}else if(idade<18){
			
			System.out.println("O aluno(a) " + nome + " é menor de idade" );
		}else if(idade >60) {
			
			System.out.println("O aluno(a) " + nome + " é idoso" );
		}else {
			System.out.println("Informe idade valida" );
		}

	}

}
