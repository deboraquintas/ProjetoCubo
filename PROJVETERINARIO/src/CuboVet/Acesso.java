package CuboVet;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
//importei o que era necessário para a classe
         
public class Acesso { //declarei a classe responsável pelo acesso ao sistema da clinica vet
	
	//criação dos atributos
	int opcao = 0;
	String usuario, senha;
	MenuClinicaVet mnf = new MenuClinicaVet();  // instanciei a classe 
	Login lg = new Login(); //criei uma lista
	
	
	Scanner sc = new Scanner(System.in);  //instanciei o scanner
	
	private List<Login> listalogins = new ArrayList<>();
	
	
			//criei o método acesso e adicionei o obj login
	public void Acessos() {
		listalogins.add(new Login("admin", "admin"));
	
	}
	
	   
	
	
	
	  // criei o método para entrar no sistema onde ela vai apresentar a opção de fazer login ou sair do sistema 
	public void EntrarSistema()
	{
	
	System.out.println("\n##########################################################");
	System.out.println("-----------Faça login na Vet Clinica-----------");
    System.out.println("  / \\__       /\\\\_/\\\\");
    System.out.println(" (    @\\___  ( o.o )    ");
    System.out.println(" /         O  > ^ < ");
    System.out.println("/   (_____/");
    System.out.println("/_____/   ");
	System.out.println("# Digite 01 - Para Login");
	System.out.println("# Digite 02 - Para sair");
	System.out.println("###########################################################");
	System.out.print("Digite a opção desejada:");
	opcao = sc.nextInt();  //armazena a opção escolhida
	Acessos();
	
	
	 // se o usuário e senha coincidirem com o pré definido anteriormente ele trará como retorno o login realizado com sucesso 
	if (opcao == 1) {
	
		System.out.println("Informe o usuário de acesso: ");
		usuario = sc.next();
		System.out.println("Informe a senha:  ");
		senha = sc.next();
		
		boolean loginValido = false;  //criei um loop para percorrer a lista de logins e verificar se há um usuário e senha válidos
		for (Login login : listalogins) {
		    if (login.getUsuario().contains(usuario) && login.getSenha().contains(senha)) {

		        loginValido = true;
		        break;
		    }
		}

		  
		if (loginValido) {
		    System.out.println("Login realizado com sucesso!!");
		    mnf.Menu();
		} else {
		
		    System.out.println("Usuário ou senha inválidos");
		    EntrarSistema();
		}

	}else if (opcao == 2) {
			System.out.println("Até logo!!");
		}else { 
			System.out.println("Opção inválida");
			EntrarSistema();
		}
	}
	}
	


