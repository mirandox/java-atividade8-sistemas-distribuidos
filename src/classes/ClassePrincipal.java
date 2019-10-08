package classes;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua avenida rodovia", Integer.valueOf(25), Integer.valueOf(1842));
		Endereco endereco2 = new Endereco("Rodovia da rua da avenida", Integer.valueOf(147), Integer.valueOf(012345));
		
		Usuario usuario1 = new Usuario("Gabriel Dorneles", Integer.valueOf(76945), endereco1, "email@gmail.com", "dorns");
		Usuario usuario2 = new Usuario("Felipe Miranda", Integer.valueOf(456787), endereco2, "email_teste@gmail.com", "oraculo");
		
		Corretor corretor1 = new Corretor("Teste creci");
		Corretor corretor2 = new Corretor("Teste creci");
		
		Imovel imovel1 = new Imovel(endereco1, Integer.valueOf(1), Double.valueOf(800.00));
		Imovel imovel2 = new Imovel(endereco2, Integer.valueOf(2), Double.valueOf(900.00));
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		Gerente gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();
		
		corretor1.cadastrar(imovel1);
		corretor2.cadastrar(imovel2);
		
		cliente1.agendarVisita(imovel1);
		cliente1.reservar(imovel1);
		cliente2.agendarVisita(imovel2);
		cliente2.reservar(imovel2);
		
		gerente1.alterarBonificacao(corretor1);
		gerente2.alterarBonificacao(corretor2);
		
		imovel1.mostrarInformacoes();
		imovel2.mostrarInformacoes();
	}
}
