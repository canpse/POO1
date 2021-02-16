package diagramas;

public class Conta {

	String banco;
	int agencia;
	int numeroconta;
	double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String banco, int agencia, int numeroconta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroconta(numeroconta);
		setSaldo(saldo);
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
		saldo = saldo + valor;
		return true;
	}
	
	public boolean saque(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
