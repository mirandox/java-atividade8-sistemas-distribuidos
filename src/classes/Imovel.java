package classes;

public class Imovel {

	private Endereco endereco;
	
	private Integer codigo;
	
	private Double valorVenda;
	
	public Imovel() {}
	
	public Imovel(Endereco endereco, Integer codigo, Double valorVenda) {
		super();
		this.endereco = endereco;
		this.codigo = codigo;
		this.valorVenda = valorVenda;
	}

	public void mostrarInformacoes() {
		 System.out.println("Imovel [endereco=" + endereco + ", codigo=" + codigo + ", valorVenda=" + valorVenda + "]");
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String toString() {
		return "Imovel [endereco=" + endereco + ", codigo=" + codigo
				+ ", valorVenda=" + valorVenda + "]";
	}
}
