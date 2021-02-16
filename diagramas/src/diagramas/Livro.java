package diagramas;

public class Livro extends Item {

	String autor;
	public Livro() {
		
	}

	public Livro(int codigo, String descricao,String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}
	

}
