package CuboVet;

public class Produto {

	
	private String idproduto, nmproduto, descproduto, valorproduto;  //declarei atributos privados p armazenar as info dos produtos

	public String getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(String idproduto) {
		this.idproduto = idproduto;
	}

	public String getNmproduto() {
		return nmproduto;
	}

	public void setNmproduto(String nmproduto) {
		this.nmproduto = nmproduto;
	}

	public String getDescproduto() {
		return descproduto;
	}

	public void setDescproduto(String descproduto) {
		this.descproduto = descproduto;
	}

	public String getValorproduto() {
		return valorproduto;
	}

	public void setValorproduto(String valorproduto) {
		this.valorproduto = valorproduto;
	}

	public Produto(String idproduto, String nmproduto, String descproduto, String valorproduto) {  //construtores
		this.idproduto = idproduto;
		this.nmproduto = nmproduto;
		this.valorproduto = valorproduto;
		this.descproduto = descproduto;
	}
	public Produto() {
		
	}
	@Override
	public String toString() {
		return("Produto: #Id: " + idproduto + " #Nome: " + nmproduto + " #Descri��o: " + descproduto + " #Valor: R$" + valorproduto );
	}

}