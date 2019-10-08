package classes;

public class Cliente extends Usuario {
	
	public Cliente() {}

	public void agendarVisita(Imovel imovel) {
		System.out.println("A visita para o imóvel " + imovel + " foi agendada com sucesso!");
	}
	
	public void reservar(Imovel imovel) {
		System.out.println("O imóvel " + imovel + " foi reservado com sucesso!");
	}
}
