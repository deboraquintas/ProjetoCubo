package CuboVet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaProdutoVet {

		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto(); //declarei os atributos
		int escolhaProd = 0;
		MenuClinicaVet mn = new MenuClinicaVet();

		public void ProdutosVet() {   // criei e inicializei a lista de produtos

			List<Produto> listaproduto = new ArrayList<>();

			listaproduto.add(new Produto("001", "Mochila", "Mochila pet visão panorâmica cor rosa", "R$ 289.90"));
			listaproduto.add(new Produto("002", "Cama", "Caminha Wolf Classic", "R$ 55.70"));
			listaproduto.add(new Produto("003", "Ração", "Royal Canin 5kg", "R$ 72.90"));
			listaproduto.add(new Produto("004", "Biscoitos", "Biscoitos de Carne 200g", "R$ 7.80"));
			listaproduto.add(new Produto("005", "Biscoitos", "Biscoitos Amanteigados pacote 10g", "R$ 2.99"));
			listaproduto.add(new Produto("006", "Sabonete", "Sabonete para animais domésticos", "R$ 5.10"));
			listaproduto.add(new Produto("007", "Fantasia", "Fantasia de Carnaval Temas Diversos", "R$ 62.50"));
			listaproduto.add(new Produto("008", "Banho", "Banho Completo", "R$ 30.00"));
			listaproduto.add(new Produto("009", "Banho e Tosa", "Banho e Tosa Completa", "R$ 50.00" ));
			

			for (Produto lista : listaproduto) {
				System.out.println(lista);
			}
			System.out.println("");
			System.out.println("Lista finalizada!!");
			System.out.println("");

		}

		public void MenuItens() {  //criei um método para exibir as opções do menu

			System.out.println("Digite 1 para voltar ao menu principal");
			System.out.println("Digite 2 para sair do programa");
			System.out.println("Opcao:");
			escolhaProd = sc.nextInt();
			if (escolhaProd == 1) {
				mn.Menu();
			} else if (escolhaProd == 2) {
				System.out.println("Finalizado, Volte sempre!");
			} else {
				System.out.println("Opção inválida");
				MenuItens();
			}
		}
}
