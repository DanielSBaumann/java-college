package control;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import model.MAluno;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Aluno extends Pessoa {

	@ManyToOne
	@JoinColumn(name = "id_turma", nullable = true, foreignKey = @ForeignKey(name = "fk_id_turma"))
	protected Turma turma;
	@Column
	protected String matricula;
	@OneToMany(cascade = CascadeType.ALL)
	// @JoinColumn(name = "id_avaliacao", nullable = true, foreignKey =
	// @ForeignKey(name = "fk_Aluno_Avaliacao"))
	protected List<Avaliacao> avaliacao;

	public boolean cadastrar(String nome, String cpf, String email, String login, String senha, String matricula) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;

		return new MAluno().cadastrar(this);

	}

	public List<Aluno> doLogin(String login, String senha) {

		System.out.println("Control Aluno -> Login");

		this.login = login;
		this.senha = senha;

		return new MAluno().doLogin(this);

	}

	public Aluno user(int id) {
		return (Aluno) new MAluno().user(id).get(0);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
