package classes;

public class Gerente extends Corretor {
	
	public Gerente() {}

	public void alterarBonificacao(Corretor corretor) {
		System.out.println("A bonifica��o do corretor " + corretor + " foi alterada com sucesso!");
	}
}
