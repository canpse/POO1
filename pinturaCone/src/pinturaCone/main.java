package pinturaCone;
import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		
		//sem passar argumentos
		Cone cone0 = new Cone();
			cone0.setRaio(6);
			cone0.setAltura(8);
			cone0.setTinta(1);
		
		// passando 1 argumento
		Cone cone1 = new Cone(6);
			cone1.setAltura(8);
			cone1.setTinta(1);
		
		// passando 2 argumentos
		Cone cone2 = new Cone(6,8);
			cone2.setTinta(1);
		
		//passando tres argumentos
		Cone cone3 = new Cone(6,8, 1);
		
		System.out.println("cone 0:\n " + cone0.toString());
		System.out.println("cone 1:\n " + cone1.toString());
		System.out.println("cone 2:\n " + cone2.toString());
		System.out.println("cone 3:\n " + cone3.toString());
	}
}
