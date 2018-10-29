
package domain;

import java.util.Set;

public class WorkPlan {

	//----------Relaciones--------

	private Set<Phase>	phase;


	//----------Getters y Setters-----

	public Set<Phase> getPhase() {
		return this.phase;
	}

	public void setPhase(final Set<Phase> phase) {
		this.phase = phase;
	}

}
