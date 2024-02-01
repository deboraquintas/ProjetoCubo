package CuboVet;

import java.util.Scanner;

import CuboVet.Estoque;
import CuboVet.ListaProdutoVet;

public class MenuClinicaVet {
	public void Menu() {
		Scanner scMenu = new Scanner(System.in);
		
		//declaro as variáveis
		int escolha = 0;
		ListaProdutoVet lp = new ListaProdutoVet();
		Estoque est = new Estoque();

		
		//mostro o menu para o usuário
		System.out.println("---------Escolha uma opção-----------");
		System.out.println("# 1 - Listar todos os produtos     #");
		System.out.println("# 2 - Estoque                      #");
		System.out.println("# 3 - Sair                         #");
		System.out.println("####################################");

		System.out.print("Opção:");
		escolha = scMenu.nextInt();
		
		//criei a estrutura condicional if e else
		if (escolha == 1) {
			System.out.println("Carregando a lista de produtos");
			lp.ProdutosVet();  //chamada recursiva do menu
			Menu();
			

		} else if (escolha == 2) {
			System.out.println("Carregando o estoque...");
			est.MostrarEstoque();
	

		} else if (escolha == 3) {
			System.out.println("Até logo...");

		} else {
			System.out.println("Escolha invalida!!");
		}
	}
}
