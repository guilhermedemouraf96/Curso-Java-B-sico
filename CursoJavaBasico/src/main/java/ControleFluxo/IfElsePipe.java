package ControleFluxo;

public class IfElsePipe {
	
	public static void main(String[] args) {
		String nome = "Guilherme";
		int idade = 18;
		int idadePermitida = 18;
		boolean Emancipado = false;
		
		if(idade >= idadePermitida || Emancipado) {
			
			System.out.println("O candidato " + nome + " pode tirar a CNH");
			
			
		}else {
			System.out.println("O candidato " + nome + " não pode tirar a CNH");
			
		}

		
	}
	
	
}
