package control;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "questoes")
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@DynamicInsert(value = true)
public class Questoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@Column(nullable = true)
	protected int nivel;
	@Column(nullable = true)
	protected String referencia;
	@Column(nullable = true)
	protected String enunciado;
	@ManyToOne
	@JoinColumn(name = "id_disciplina", nullable = true, foreignKey = @ForeignKey(name = "fk_id_disciplina"))
	protected Disciplina disciplina;
	@Column(nullable = true)
	protected String resposta1;
	@Column(nullable = true)
	protected String resposta2;
	@Column(nullable = true)
	protected String resposta3;
	@Column(nullable = true)
	protected String resposta4;
	@Column(nullable = true)
	protected String resposta5;
	@Column(nullable = true)
	protected String respostaCorreta;

}
