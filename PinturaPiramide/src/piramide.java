
public class piramide {

	//atributos
	double ab = 0.0; // metade do tamanho da arestra
	double h = 0.0; // altura da piramide
	double al = 0.0; // altura do triangulo
	double areaTriangulo = 0.0; // 
	double areaBase = 0.0;
	double areaTotal;
	int tipoTinta = 0;
	double litros = 0.0;
	double latas = 0.0; // arredondado para cima
	double preco = 0.0;
	double volume = 0.0;
	
	public piramide(double ab, double h, int tipoTinta) {
		if (ab<=0 || h <= 0) {
			
		}else {
			this.ab = ab;
			this.h = h;
		}
		if (tipoTinta <1 || tipoTinta > 3) {
			
		} else {
			this.tipoTinta = tipoTinta;
		}
		
		areaTriangulo();
		areaBase();
		areaTotal();
		volume();
		litros();
		latas();
		preco();
		
		
	}
	
	// getters e setters
	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getAl() {
		return al;
	}
	public void setAl(double al) {
		this.al = al;
	}
	public double getAreaTriangulo() {
		return areaTriangulo;
	}
	public void setAreaTriangulo(double areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}
	public double getAreaBase() {
		return areaBase;
	}
	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getLatas() {
		return latas;
	}
	public void setLatas( double latas) {
		this.latas = latas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	//toString
	
	
	// metodos adicionais
	
	private void areaTriangulo() {
		al = Math.sqrt((h*h)+(ab*ab));
		areaTriangulo = ((2*ab)*al)/2;
	}
	
	private void areaBase() {
		areaBase = (ab*2)*(ab*2);
	}
	
	private void areaTotal() {
		areaTotal = (areaTriangulo*4)+areaBase;
	}
	
	private void volume() {
		volume = (areaBase*h)/3;
	}
	
	private void litros() {
		litros = areaTotal/4.76;
	}
	
	private void latas() {
		latas = Math.ceil(litros/18.0);
	}
	
	private void preco() {
		switch (tipoTinta) {
		case 1: {
			preco = latas*127.9;
			break;
		}
		case 2:{
			preco = latas*258.98;
			break;
		}
		case 3:{
			preco = latas*344.34;
			break;
		}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("piramide \nab=");
		builder.append(ab);
		builder.append(", \nh=");
		builder.append(h);
		builder.append(", \nal=");
		builder.append(al);
		builder.append(", \nareaTriangulo=");
		builder.append(areaTriangulo);
		builder.append(", \nareaBase=");
		builder.append(areaBase);
		builder.append(", \nareaTotal=");
		builder.append(areaTotal);
		builder.append(", \ntipoTinta=");
		builder.append(tipoTinta);
		builder.append(", \nlitros=");
		builder.append(litros);
		builder.append(", \nlatas=");
		builder.append(latas);
		builder.append(", \npreco=");
		builder.append(preco);
		builder.append(", \nvolume=");
		builder.append(volume);
		builder.append("");
		return builder.toString();
	}

	
}
