package classes;

public class Corretor extends Usuario{

	private String creci;
	
	public Corretor() {}
	
	public Corretor(String creci) {
		super();
		this.creci = creci;
	}

	public void cadastrar(Imovel imovel) {
		System.out.println("O imóvel " + imovel + " foi cadastrado com sucesso!");
	}

	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}

	public String toString() {
		return "Corretor [creci=" + creci + "]";
	}
}
