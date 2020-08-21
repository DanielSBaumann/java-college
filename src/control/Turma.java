package control;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "turmas")
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@Column
	protected int numTurma;
	@OneToMany (cascade = CascadeType.ALL) 
	//@JoinColumn(name = "id_aluno", nullable = true, foreignKey = @ForeignKey(name = "fk_Turma_Aluno"))
	protected List<Aluno> alunos;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "disciplina_turma", joinColumns = @JoinColumn(name = "id_turma"), inverseJoinColumns = @JoinColumn(name = "id_disciplina"))
	protected List<Disciplina> disciplinas;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumTurma() {
		return numTurma;
	}
	public void setNumTurma(int numTurma) {
		this.numTurma = numTurma;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	
}
