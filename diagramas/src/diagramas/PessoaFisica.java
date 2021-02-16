package diagramas;

public class PessoaFisica extends Pessoa {

	String cpf;
	String estadoCivil;
	
	public PessoaFisica() {

	}

	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
