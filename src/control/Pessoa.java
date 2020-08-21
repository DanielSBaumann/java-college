package control;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@Column(name = "nome", nullable = false, length = 200)
	protected String nome;
	@Column(name = "cpf", nullable = false, length = 11)
	protected String cpf;
	@Column(name = "telefone", nullable = true, length = 13)
	protected String telefone;
	@Column(name = "endereco", nullable = true, length = 100)
	protected String endereco;
	@Column(name = "email", nullable = false, length = 200)
	protected String email;
	@Column(name = "niver", nullable = true)
	protected Date niver;
	@Column(name = "login", nullable = false, length = 200)
	protected String login;
	@Column(name = "senha", nullable = false, length = 200)
	protected String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNiver() {
		return niver;
	}

	public void setNiver(Date niver) {
		this.niver = niver;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
