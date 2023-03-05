package ControleFluxo;

public class ifElse {
	
	public static void main(String[] args) {
		/** If e Else com &&(e)
		 * 
		 * 
		 */
		//Atributos
		String nome = "Guilherme";
		String ra = "917122671";
		int nota1 = 6;
		int nota2 = 7;
		int nota3 = 10;
		int mediaAprovacao =6;
		int media= (nota1 + nota2 + nota3)/3;
		boolean faltas = true;
		//Condição
		if(media>mediaAprovacao && faltas){
			
			System.out.println("O aluno " + nome + " portador do RA " + ra + " foi aprovado ");
			
		//Se a condição não for atingida	
		}else {
			System.out.println("O aluno " + nome + " portador do RA " + ra + " foi reprovado ");
			
		}
	
		
		
	}

}
