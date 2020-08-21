package control;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import model.MProfessor;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Professor extends Funcionario {

	@Column
	protected double matricula;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "disciplina_professor", joinColumns = @JoinColumn(name = "id_professor"), inverseJoinColumns = @JoinColumn(name = "id_disciplina"))
	protected List<Disciplina> disciplinas;
	@OneToMany(cascade = CascadeType.ALL)
	protected List<Avaliacao> avaliacao;

	public boolean cadastrar(String nome, String cpf, String email, String login, String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.login = login;
		this.senha = senha;

		return new MProfessor().cadastrar(this);

	}

	public Professor user(int id) {
		return (Professor) new MProfessor().user(id).get(0);
	}

}
