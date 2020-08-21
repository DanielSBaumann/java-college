package control;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "disciplinas")
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@Column
	protected String nome;
	@ManyToMany(mappedBy = "disciplinas")
	protected List<Professor> professores;
	@ManyToMany(mappedBy = "disciplinas")
	protected List<Turma> turmas;
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "id_questao", nullable = true, foreignKey = @ForeignKey(name = "fk_Disciplina_Questao"))
	protected List<Questoes> questoes;

}
