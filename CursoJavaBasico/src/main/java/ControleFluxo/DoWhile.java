package ControleFluxo;

public class DoWhile {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 20;
		
		do {
			System.out.println("Entrei no while, o numero 1 vale " + numero1);
			numero1 ++;
			
		} while (numero1<numero2);
		System.out.println("Fora do while, o numero " + numero1 + " vale " + numero1);
		
	}

}
