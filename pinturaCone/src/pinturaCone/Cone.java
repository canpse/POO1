package pinturaCone;

public class Cone {
	
	public static final double $1 = 238.9;
	public static final double $2 = 467.98;
	public static final double $3 = 758.34;
	public static final double rendimento = 3.45;
	public static final double VolumeLata = 18;
	
	double altura = 0;
	double raio = 0;
	int tinta = 0;
	
	
	public Cone() {
		
	}
	public Cone(double raio) {
		setRaio(raio);
	}
	public Cone(double raio, double altura) {
		setAltura(altura);
		setRaio(raio);
	}
	public Cone(double raio, double altura,int tinta) {
			setAltura(altura);
			setRaio(raio);
			setTinta(tinta);
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (0<altura) {
			this.altura = altura;
		}	
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (0<raio) {
			this.raio = raio;
		}
	}
	public int getTinta() {
		return tinta;
	}
	public void setTinta(int tinta) {
		if (0<tinta && tinta<4) {	
			this.tinta = tinta;
		}
	}
	public String erro() {
		return "Erro na entrada de dados";
	}
	
	double geratris() {
		double geratris = Math.sqrt((altura*altura)+(raio*raio));
		return geratris;
	}
	double areaFundo() {
		double areaFundo = (Math.PI)*(Math.pow(raio, 2));
		return areaFundo;
	}
	double areaCone() {
		double areaCone = Math.PI*raio*(raio+geratris());
		return areaCone;
	}
	double areaLateral() {
		double areaLateral = Math.PI*geratris()*raio;
		return areaLateral;
	}
	double litros() {
		double litros = areaCone() * rendimento;
		return litros;
	}
	double latas() {
		double latas =  (litros() / VolumeLata);
		latas = Math.ceil(latas);
		return latas;
	}
	double preco() {
		double preco = 0.0;
		switch (tinta) {
			case 1: {
				preco = latas() * $1;
				break;
			}
			case 2: {
				preco = latas() * $2;
				break;
			}
			case 3: {
				preco = latas() * $3;
				break;
			}
		}
		return preco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n_________________________");
		builder.append("\nraio= ");
		builder.append(raio);
		builder.append(", \naltura= ");
		builder.append(altura);
		builder.append(", \ntinta= ");
		builder.append(tinta);
		builder.append("\n_________________________");
		builder.append(", \ngeratris()= ");
		builder.append(geratris());
		builder.append("\n_________________________");
		builder.append(", \nareaFundo()= ");
		builder.append(areaFundo());
		builder.append(", \nareaLateral()= ");
		builder.append(areaLateral());
		builder.append(", \nareaCone()= ");
		builder.append(areaCone());
		builder.append("\n_________________________");
		builder.append(", \nlitros()= ");
		builder.append(litros());
		builder.append(", \nlatas()= ");
		builder.append(latas());
		builder.append("\n_________________________");
		builder.append(", \npreco()= ");
		builder.append(preco());
		builder.append("\n_________________________");
		return builder.toString();
	}
	
	

	
	
	
}
