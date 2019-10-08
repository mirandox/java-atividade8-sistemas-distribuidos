package classes;

public class Cliente extends Usuario {
	
	public Cliente() {}

	public void agendarVisita(Imovel imovel) {
		System.out.println("A visita para o im�vel " + imovel + " foi agendada com sucesso!");
	}
	
	public void reservar(Imovel imovel) {
		System.out.println("O im�vel " + imovel + " foi reservado com sucesso!");
	}
}
