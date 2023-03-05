package Herança;

public class ExecutaHerança {

	public static void main(String[] args) {
		Carros simples = new Carros();
		CarrosEspeciais especiais = new CarrosEspeciais();
		
		especiais.ligar();
		simples.desligar();
		

	}

}
