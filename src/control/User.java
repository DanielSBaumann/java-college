package control;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import model.MUser;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@Column(name = "id_table", nullable = false)
	protected long id_table;
	@Column(name = "tipo", nullable = false, length = 200)
	protected String tipo;
	@Column(name = "login", nullable = false, length = 200)
	protected String login;
	@Column(name = "senha", nullable = false, length = 200)
	protected String senha;

	public boolean cadastrar(long id_table, String tipo, String login, String senha) {

		this.id_table = id_table;
		this.tipo = tipo;
		this.login = login;
		this.senha = senha;

		return new MUser().cadastrar(this);

	}

	public List<User> login(String login, String senha) {

		System.out.println("Control User -> Login");

		this.login = login;
		this.senha = senha;

		return new MUser().login(this);

	}
	
	public User user(long id) {
		return (User) new MUser().user(id).get(0);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_table() {
		return id_table;
	}

	public void setId_table(long id_table) {
		this.id_table = id_table;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
