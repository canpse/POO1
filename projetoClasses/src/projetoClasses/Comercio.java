package projetoClasses;

public class Comercio {
	
	private String cnpj;

	public Comercio() {
	}
	
	

	public Comercio(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length()>0)
			this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercio [cnpj=");
		builder.append(cnpj);
		builder.append("]");
		return builder.toString();
	}
}
