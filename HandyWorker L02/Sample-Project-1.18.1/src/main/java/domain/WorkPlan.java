
package domain;

import java.util.Collection;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class WorkPlan {

	//----------Relaciones--------

	private Collection<Phase>	phase;

	//----------Getters y Setters-----

	@NotNull
	@NotEmpty
	@Valid
	public Collection<Phase> getPhase() {
		return this.phase;
	}

	public void setPhase(final Collection<Phase> phase) {
		this.phase = phase;
	}

}
