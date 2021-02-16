package diagramas;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// Exercicio 1
		// classe pessoa pai
		System.out.println("Classe de pessoas fisicas e juridicas  exercicio 1\n");
		Pessoa p = new Pessoa("Lucas","Rio do sul");
		System.out.println(p.toString());
		
		//pessoa fisica
		PessoaFisica pf = new PessoaFisica("Lucas","Rio do sul","111.111.111-11","Solteiro");
		System.out.println(pf.toString());
		
		//Pessoa juridica
		PessoaJuridica pj = new PessoaJuridica("Lucas","Rio do sul","111.111./111-11","multinacional");
		System.out.println(pj.toString());
		
		System.out.println("\n\n__________________________\n\n");
		
		
		//exercicio 2
		System.out.println("Itens exercicio 2\n");
		//item
		Item i = new Item(81673,"brilhante");
		System.out.println(i.toString());
		
		//livro
		Livro l = new Livro(81673,"senhor aneis", "tolkien");
		System.out.println(l.toString());
		
		//midia
		Midia m = new Midia(23532,"o senhor dos aneis","warner",3f);
		System.out.println(m.toString());
		
		//CD
		CD cd = new CD(86948,"must listen","capitol records",43f,10,"pink Floyd","dark side of the moon");
		System.out.println(cd.toString());
		
		//VHS
		VHS v = new VHS(23532,"filme","warner",3f, "O senhor dos aneis as duas torres");
		System.out.println(v.toString());
		
		System.out.println("\n\n__________________________\n\n");
		
		//Exercicio 3 - simples contas
		
		System.out.println("//Exercicio 3 - simples contas\n");
		
		// Conta
		Conta c = new Conta("Sicoob",001, 30003, 10000.0);
		System.out.println(c.toString());
		c.deposito(1000);
		System.out.println(c.toString());
		c.saque(2000);
		System.out.println(c.toString());
		
		//Conta simples
		ContaSimples cs = new ContaSimples("Sicoob",001, 30003, 10000.0, 1000000.0);
		System.out.println(cs.toString());
		cs.depositoPoupanca(1000);
		System.out.println(cs.toString());
		cs.saquePoupanca(1000000);
		System.out.println(cs.toString());
		
		//Conta especial
		ContaEspecial ce = new ContaEspecial("Sicoob",001, 30003, 10000.0, 100, 10000);
		System.out.println(cs.toString());
	}

}
