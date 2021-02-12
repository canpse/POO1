import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque separado por espaços e na ordem o ab o h e o tipo de tinta:");
		double ab = entrada.nextDouble();
		double h = entrada.nextDouble();
		int tipoTinta = entrada.nextInt();
		
		piramide piramide1 = new piramide(ab,h,tipoTinta);
		
		System.out.println(piramide1.toString());
		
		
	}

}
