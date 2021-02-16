package diagramas;

public class Midia extends Item {
	
	String gravadora;
	float duracao;

	public Midia() {
		
	}

	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("]");
		return builder.toString();
	}

	
}
