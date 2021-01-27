package selecao;
import java.util.Scanner;

public class AtividadesSelecao {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Qual exercicio voce quer ver: ");
			int num = entrada.nextInt();
					
			switch (num) {
			case 1:
				System.out.println("Exercicio 1 - selecionado");
				System.out.print("\nInforme seu peso: ");
				double peso = entrada.nextDouble();
				
				System.out.print("\nInforme sua altura: ");
				double altura = entrada.nextDouble();
				entrada.nextLine();
				
				System.out.print("\nQual seu genero? \nm para masculino \nf para feminino: ");
				char genero = 'o';
				genero = entrada.nextLine().charAt(0);
				double ideal = 0.0;
				
				boolean retorno = false;
				
				if (genero == 'm') {
					ideal = (72.7 * altura) - 58.0;
					retorno = true;
				} else if (genero == 'f') {
					ideal = (62.1*altura) - 44.7;
					retorno = true;
				} else {
					retorno = false;
				}
				System.out.println("\n-------------------------------------");
				if (retorno == true) {
					System.out.print("\nSeu genero: " + genero);
					System.out.print("\nSua altura é: "  + altura);
					System.out.print("\nSeu peso é: " + peso);
					System.out.print("\nSeu peso ideal é: " + ideal);
					System.out.println("\n-------------------------------------");
					if (peso > ideal) {
							System.out.println("\nVoce esta acima do seu peso ideal");
					}else if (peso < ideal) {
							System.out.println("\nVoce esta abaixo do seu peso ideal");
					}else
							System.out.println("\nvoce esta no seu peso ideal");
							System.out.println("\n-------------------------------------");
				} else {
					System.out.println("\nselecao errada de genero");
				}
				break;
				
			case 2:
				System.out.println("Exercicio 2 - selecionado");
				System.out.println("\n-------------------------------------");
				
				System.out.println("\nInforme seu salario: ");
				double SalarioAt = entrada.nextDouble();
				System.out.println("\n-------------------------------------");
				double Porcentagem = 20.0;
				if (SalarioAt >= 1500 ) 
					Porcentagem -= 15; 
				else if (SalarioAt > 700.0 )
						Porcentagem -= 10;
					else if (SalarioAt > 280 )
							Porcentagem -= 5;
				Porcentagem = Porcentagem/100;
				double SalarioNovo = SalarioAt + SalarioAt*Porcentagem;
				
				System.out.println("\n-------------------------------------");
				System.out.println("\n-------------------------------------");
				System.out.println("\n------- Caluculo do reajuste --------");
				System.out.println("salario atual: $" + SalarioAt);
				System.out.println("Porcentagem do aumento: " + Porcentagem*100 + "%");
				System.out.println("Valor do aumento: $" + SalarioAt*Porcentagem);
				System.out.println("Novo Salario: $" + SalarioNovo);
			break;

			case 3:
				System.out.println("Exercicio 3 - selecionado");
				System.out.println("\n-------------------------------------");
				System.out.print("\nInforme seu saque: ");
				int Saque = entrada.nextInt();
				System.out.println("\n-------------------------------------");
				System.out.println("\n---------Total de notas--------------");
				int Sobra = Saque/100;
				System.out.print("\n Serão " + Sobra + " notas de 100");
				Saque = Saque-100*Sobra;
				Sobra = Saque/50;
				System.out.print("\n Serão " + Sobra + " notas de 50");
				Saque = Saque-50*Sobra;
				Sobra = Saque/10;
				System.out.print("\n Serão " + Sobra + " notas de 10");
				Saque = Saque-10*Sobra;
				Sobra = Saque/5;
				System.out.print("\n Serão " + Sobra + " notas de 5");
				Saque = Saque-5*Sobra;
				Sobra = Saque/1;
				System.out.print("\n Serão " + Sobra + " notas de 1");
				System.out.println("\n-------------------------------------");
			break;
			
			}

		}
}
