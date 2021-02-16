package diagramas;

public class ContaSimples extends Conta {
	
	double saldoPoupanca;

	public ContaSimples() {
		
	}

	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		saldoPoupanca = saldoPoupanca + valor;
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if (saldoPoupanca >= valor) {
			saldoPoupanca = saldoPoupanca - valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}
	
	

}
