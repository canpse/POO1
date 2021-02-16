package diagramas;

public class ContaEspecial extends Conta {
	
	int diasSemJuros;
	double limite;

	public ContaEspecial() {
		
	}

	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if (this.diasSemJuros >= 0)
			this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite >= 0)
			this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
	
}
