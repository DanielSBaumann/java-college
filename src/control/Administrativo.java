package control;

import javax.persistence.Entity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import model.MAdministrativo;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Administrativo extends Pessoa {

	public boolean cadastrar(String nome, String cpf, String email, String login, String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.login = login;
		this.senha = senha;

		return new MAdministrativo().cadastrar(this);

	}

	public Administrativo user(int id) {
		return (Administrativo) new MAdministrativo().user(id).get(0);
	}

}
