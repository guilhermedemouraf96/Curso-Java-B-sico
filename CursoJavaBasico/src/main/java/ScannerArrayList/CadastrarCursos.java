package ScannerArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCursos {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add("Testes UI");
		cursos.add("Testes de API");
		cursos.add("Testes Unitários");

		String opcao;
		System.out.println("Digite 1 para cadastrar um curso ou digite 2 para excluir ou qualquer tecla para exibir lista");
		opcao = scanner.nextLine();

		while (opcao.equals("1")) {
			System.out.println("Digite o curso desejado");
			String curso = scanner.nextLine();
			cursos.add(curso);
			System.out.println("Digite 1 para cadastrar um curso ou digite 2 para excluir ou qualquer tecla para exibir lista");
			opcao = scanner.nextLine();
		}while (opcao.equals("2")) {
			System.out.println("Digite o curso desejado");
			String curso = scanner.nextLine();
			cursos.remove(curso);
			System.out.println("Digite 1 para cadastrar um curso ou digite 2 para excluir ou qualquer tecla para exibir lista");
			opcao = scanner.nextLine();
			
		}
			System.out.println("cursos cadastrados: \n"  + cursos);
		}
	
	}
		
	


