package projetoClasses;

public class exemplo {

	public static void main(String[] args) {
		
		// exemplo de uso de relacoes de classes
		// este exemplo demonstra um sistema varejista que
		//vende um unico produto e pode ter um servico
		
		
		//definindo os objetos
		Produto p = new Produto("pedra", 10.0);
		Varejista v = new Varejista("13123123213",0.0, p); 
		// varejista pode ser criado sem um objeto servico mas nao sem um objeto produto
		Cliente c = new Cliente("111.111.111-11");
		
		// toString atual
		System.out.println("inicio");
		System.out.println(p.toString());
		System.out.println(v.toString());
		System.out.println(c.toString());
		System.out.println("\n-------------------------------------\n");
		
		// cliente faz uma compra
		
		v.vender(c);
		System.out.println("apos uma compra de pedra");
		System.out.println(c.toString());
		System.out.println("\n-------------------------------------\n");
		
		// cliente paga
		System.out.println("Cliente paga");
		v.receber(c);
		System.out.println(v.toString());
		System.out.println(c.toString());
		System.out.println("\n-------------------------------------\n");				

	}

}
