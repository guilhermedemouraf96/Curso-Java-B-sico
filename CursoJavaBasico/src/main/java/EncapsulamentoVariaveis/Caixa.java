package EncapsulamentoVariaveis;

public class Caixa {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		System.out.println(cc.getSaldo());
		cc.setSaldo(1000);
		System.out.println(cc.getSaldo());
	}

}
