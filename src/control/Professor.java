package control;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

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
	//@JoinColumn(name = "id_avaliacao", nullable = true, foreignKey = @ForeignKey(name = "fk_Professor_Avaliacao"))
	protected List<Avaliacao> avaliacao;

}
