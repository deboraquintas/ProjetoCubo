package CuboVet;

public class Login {

	
	
	 private String usuario, senha;

	public String getUsuario() {  // coloquei os métodos de getters e setters (atributos)
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	 
	public Login(String usuario, String senha) {  //criei os construtores para chamar o objeto dentro da classe
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public Login() {
		
	}
	@Override  // método para representar o objeto de forma textual
	public String toString() {
		return("Login: " + usuario + " Senha " + senha );
	}
	
}
