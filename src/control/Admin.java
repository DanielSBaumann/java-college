package control;

import javax.persistence.Entity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import model.MAdmin;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Admin extends Pessoa {

	public boolean cadastrar(String nome, String cpf, String email, String login, String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.login = login;
		this.senha = senha;

		return new MAdmin().cadastrar(this);

	}

	public Admin user(int id) {
		return (Admin) new MAdmin().user(id).get(0);
	}

}
