import java.util.Random;
import java.util.Scanner;



public class Arrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random generator = new Random();
		do {
			boolean ok = true;
			int n = 0;
			do {	
				ok = true;
				System.out.print("\nQuantos numeros voce gostaria de gerar: ");
				n = entrada.nextInt();
				if (n<=0) {
					ok = false;
					System.out.println("\n____________________________________________________");
					System.out.println("\nPor favor digite um valor acima de zero");
				}
			} while (ok == false);
				int vet[][] = new int[n][2];
				int pulaLinhas = 0;
				System.out.print("\nNumeros gerados:");
				for (int x = n-1; x >= 0; x--) {
					vet[x][0] = generator.nextInt(5000);
					System.out.print(" " + vet[x][0]+ " - ");
					pulaLinhas++;
					if (pulaLinhas>=10) {
						pulaLinhas = 0;
						System.out.print("\n               ");
					}
				}
				System.out.println("\n____________________________________________________");
				
				int maior = 0;
				int menor = 5001;
				for (int x = n-1; x >= 0; x--) { //verifica maior e menor
					if (vet[x][0] > maior) {
						maior = vet[x][0];
					}
					if (vet[x][0] < menor) {
						menor = vet[x][0];
					}
				}
				System.out.print("\nMaior numero: " + maior);
				System.out.print("\nMenor numero: " + menor);
				
				System.out.println("\n____________________________________________________");
				pulaLinhas = 0;
				System.out.print("\nNumeros pares:");
				for (int x = n-1; x >= 0; x--) {
					if (vet[x][0]%2==0) {
						System.out.print(" " + vet[x][0] + " - ");
						pulaLinhas++;
					}
					if (pulaLinhas>=10) {
						pulaLinhas = 0;
						System.out.print("\n               ");
					}
				}
				
				System.out.println("\n____________________________________________________");
				pulaLinhas = 0;
				System.out.print("\n\nNumeros impares:");
				for (int x = n-1; x >= 0; x--) {
					if (vet[x][0]%2!=0) {
						System.out.print(" " + vet[x][0] + " - ");
						pulaLinhas++;
					}
					if (pulaLinhas>=10) {
						pulaLinhas = 0;
						System.out.print("\n               ");
					}
				}
				System.out.println("\n____________________________________________________");
				
				pulaLinhas = 0;
				boolean primo = true;
				System.out.print("\n\nNumeros primos:");
				for (int x = n-1; x >= 0; x--) {
					for (int j = 2; j < vet[x][0]; j++) {
						if (vet[x][0] % j == 0) {
							primo = false;
						}
					} 
					if (primo == true) {
						System.out.print(" " + vet[x][0] + " - ");
						pulaLinhas++;
					}
					if (pulaLinhas>=10) {
						pulaLinhas = 0;
						System.out.print("\n               ");
					}
					primo = true;
				}
				System.out.println("\n____________________________________________________");
				
				int soma = 0;
				for (int x = n-1; x >= 0; x--) {
					soma += vet[x][0];
				}
				System.out.print("\nSoma: " + soma);
				double media = soma/n;
				System.out.print("\nMédia: " + media);		
				
				int contagem = 1 ;
				int moda[] = new int [n];
				int y = 0;
				int duplicata = 0;
				for (int l = 0;l<n;l++) {
					moda[l] = -1;
				}
				
				for (int x = 0; x < n; x++) {
					for (int j = 0;j < n; j++) {
						if (vet[x][0] == vet[j][0]) {
							vet[x][1] = vet[x][1] + 1; 
						}
					}
					
					if (vet[x][1] >= contagem) {
						if (vet[x][1]>contagem) {
							y=0;
							for (int l = 0;l<n;l++) {
								moda[l] = -1;
							}
						}
						contagem = vet[x][1];
						for(int t = 0;t<n;t++) {
								if (vet[x][0]==moda[t]) {
									duplicata = duplicata+1;	
								}
						}
						if (duplicata < 1) {
							moda[y] = vet[x][0];
							y=y+1;
						}
					}
				duplicata = 0;
				}
				System.out.print("\nModa: ");
				if (contagem == 1) {
					System.out.print("Amodal ");
				}else if (y==1){
					System.out.print("Unimodal ");
				} else {
					System.out.print("Multimodal ");
				}
				for (int x =0; x<n;x++) {
					if (moda[x] >= 0) {
						System.out.print(" - " + moda[x]);
					}
				}
				System.out.println("\n____________________________________________________");
				
				int aux = 0;
				
				for(int x = 0; x<n; x++) {
					for (int j = 0; j+1<n;j++) {
						if (vet[j][0]>vet[j+1][0]) {
							aux = vet[j+1][0];
							vet[j+1][0] = vet[j][0];
							vet[j][0] = aux;
						}
					}
				}
				
				System.out.println("\n____________________________________________________");
				System.out.print("\nOrdenado em ordem crescente: ");
				pulaLinhas = 0;
				for (int x = 0; x < n; x++) {
					System.out.print(" " + vet[x][0]+ " - ");
					pulaLinhas++;
					if (pulaLinhas>=10) {
						pulaLinhas = 0;
						System.out.print("\n               ");
					}
				}
				double mediana = 0;
				if (n%2==0) {
					mediana = (vet[(n/2)-1][0]+vet[(n/2)][0])/2;
				}else {
					mediana = vet[((n+1)/2)-1][0];
				}
				System.out.print("\nMediana: " + mediana);
				System.out.println("\n____________________________________________________");
				
				double somatorio = 0;
				for (int x = 0; x<n;x++) {
					somatorio = somatorio + (vet[x][0]-media)*(vet[x][0]-media);
				}
				double desvio = java.lang.Math.sqrt(somatorio/n);
				
				System.out.println("Desvio padrão: " + desvio);
				
		} while (1 == 1);
		
	}

}
