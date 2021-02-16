package diagramas;

public class PessoaJuridica extends Pessoa {

	String cnpj;
	String tipoEmpresa;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, String endereco,String cnpj,String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append("]");
		return builder.toString();
	}

	
}
