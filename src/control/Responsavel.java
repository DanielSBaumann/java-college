package control;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ForeignKey;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Responsavel extends Pessoa {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_aluno", nullable = true, foreignKey = @ForeignKey(name = "fk_Aluno_Responsavel"))
	protected Aluno aluno;

}
