package diagramas;

public class CD extends Midia {

	int faixas;
	String artista;
	String album;
	
	public CD() {
		
	}

	public CD(int codigo, String descricao, String gravadora, float duracao, int faixas, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixas(faixas);
		setArtista(artista);
		setAlbum(album);
		
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		return builder.toString();
	}
}
