import java.util.Objects;

public class CuboMV {
	
	private String nome;
	private String comida;
	private Integer doc;

	
	public CuboMV1(String nome, String comida, Integer doc) {
		this.nome= nome;
		this.comida= comida;
		this.doc= doc;

}
	public CuboMV() {  }
	

	



	public CuboMV(String nome, String comida, Integer doc) {
		super();
		this.nome = nome;
		this.comida = comida;
		this.doc = doc;
	}
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public Integer getDoc() {
		return doc;
	}
	public void setDoc(Integer doc) {
		this.doc = doc;
	}
	public static void main(String[] args) {

		System.out.println("Nome do colaborador");
	
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(comida, doc, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuboMV other = (CuboMV) obj;
		return Objects.equals(comida, other.comida) && Objects.equals(doc, other.doc)
				&& Objects.equals(nome, other.nome);
	}
	
	
	
}
