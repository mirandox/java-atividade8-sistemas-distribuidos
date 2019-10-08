package classes;

public class Gerente extends Corretor {
	
	public Gerente() {}

	public void alterarBonificacao(Corretor corretor) {
		System.out.println("A bonificação do corretor " + corretor + " foi alterada com sucesso!");
	}
}
