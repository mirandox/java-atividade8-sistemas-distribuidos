package classes;

public class Endereco {

	private String logradouro;
	
	private Integer numero;
	
	private Integer cep;
	
	public Endereco() {}
	
	public Endereco(String logradouro, Integer numero, Integer cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero
				+ ", cep=" + cep + "]";
	}
}
