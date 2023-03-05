package PercorrerString;

public class PercorrerStringLetra {

	public static void main(String[] args) {
		String mensagem = "Amo qualidade e testes de software";
		char letra = 'a';
		char letra1= 'A';
		int contador = 0;
		int contador1=0;

		for (int i = 0; i < mensagem.length(); i++) {

			if (mensagem.charAt(i) ==  letra) {

				contador++;

			}else if(mensagem.charAt(i) == letra1) {
contador1++;
		}
		
	}
		System.out.println("A letra " + letra + " aparece " + contador + " vezes");
		System.out.println("A letra " + letra1 + " aparece " + contador1 + " vezes");
	}
}
