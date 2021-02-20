package projetoClasses;

public class Produto {

	private String nome;
	private double preco;
	
	


	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public void desconto(double porcentagem) { // aplica desconto da porcentagem
		preco = preco*(porcentagem/100);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
