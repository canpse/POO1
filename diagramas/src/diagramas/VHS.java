package diagramas;

public class VHS extends Midia {
	
	String titulo;

	public VHS() {
		// TODO Auto-generated constructor stub
	}

	public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
