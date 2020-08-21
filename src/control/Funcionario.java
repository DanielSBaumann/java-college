package control;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Funcionario extends Pessoa {

	@Column(nullable = true)
	protected double salario;
	@Column(nullable = true)
	protected String cargo;
	@Column(nullable = true)
	protected Date admissao;

}
