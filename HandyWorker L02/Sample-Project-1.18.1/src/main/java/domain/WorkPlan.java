
package domain;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class WorkPlan {

	//----------Relaciones--------

	private Set<Phase>	phase;

	//----------Getters y Setters-----

	@NotNull
	@NotEmpty
	@Valid
	public Set<Phase> getPhase() {
		return this.phase;
	}

	public void setPhase(final Set<Phase> phase) {
		this.phase = phase;
	}

}
