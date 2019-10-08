package classes;

public class Usuario {

	private String nome;
	
	private Integer cpf;
	
	private Endereco endereco;
	
	private String email;
	
	private String login;
	
	public Usuario() {}
	
	public Usuario(String nome, Integer cpf, Endereco endereco, String email, String login) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", endereco="
				+ endereco + ", email=" + email + ", login=" + login + "]";
	}
}
