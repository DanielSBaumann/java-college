package control;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "avaliacoes")
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@ManyToOne
	//@JoinColumn(name = "id_aluno", nullable = true, foreignKey = @ForeignKey(name = "fk_id_aluno"))
	protected Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "id_prof", nullable = true, foreignKey = @ForeignKey(name = "fk_id_prof"))
	protected Professor professor;
	@ManyToOne
	//@JoinColumn(name = "id_disciplina", nullable = true, foreignKey = @ForeignKey(name = "fk_id_disciplina"))
	protected Disciplina disciplina;
	@Column(nullable = true)
	protected String tipo;
	@Column(nullable = true)
	protected String periodo;
	@Column(nullable = true)
	protected Date data;
	@Column(nullable = true)
	protected double nota;

}
