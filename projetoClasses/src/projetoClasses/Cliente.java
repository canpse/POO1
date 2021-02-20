package projetoClasses;

public class Cliente {
	
	private String cpf;
	private double debitos;	

	public Cliente(String cpf) {
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getDebitos() {
		return debitos;
	}

	public void setDebitos(double debitos) {
		this.debitos = debitos;
	}
	
	
	public void pagar(double valor) {
		debitos = debitos - valor;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [cpf=");
		builder.append(cpf);
		builder.append(", debitos=");
		builder.append(debitos);
		builder.append("]");
		return builder.toString();
	}
	
	

}
