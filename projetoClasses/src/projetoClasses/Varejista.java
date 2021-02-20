package projetoClasses;

public class Varejista extends Comercio {
	
	private double saldo;
	private Produto p;
	private Servicos s;


	public Varejista(String cnpj,double saldo, Produto p, Servicos s) {
		super(cnpj);
		this.saldo = saldo;
		this.p = p;
		this.s = s;
	}
	


	public Varejista(String cnpj, double saldo, Produto p) {
		super(cnpj);
		this.saldo = saldo;
		this.p = p;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
	}

	public Servicos getS() {
		return s;
	}

	public void setS(Servicos s) {
		this.s = s;
	}
	
	public void vender(Cliente cliente) {
		cliente.setDebitos(cliente.getDebitos()+p.getPreco());
	}
	
	public void receber(Cliente cliente) {
		saldo = saldo + cliente.getDebitos();
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Varejista [toString()=");
		builder.append(super.toString());
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", p=");
		builder.append(p);
		builder.append(", s=");
		builder.append(s);
		builder.append("]");
		return builder.toString();
	}
	
	

}
