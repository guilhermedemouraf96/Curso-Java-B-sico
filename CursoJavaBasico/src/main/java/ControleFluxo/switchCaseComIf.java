package ControleFluxo;

public class switchCaseComIf {

	public static void main(String[] args) {
		int opcao = 1;
		double valorProduto = 5000;
		double saldoDisponivel = 10000;

		if (saldoDisponivel >= valorProduto) {
			switch (opcao) {
			case 1:
				System.out.println("Você escolheu a opção 1");
				System.out.println("Compra realizada com sucesso");
				break;
			}

		}else {
			System.out.println("Saldo Indisponivel");
		}
	}

}
