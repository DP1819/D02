
package domain;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Endorsable extends Actor {

	// Relationships

	private Set<Endorsement>	endorsements;


	//----------Getters y Setters

	@NotNull
	@Valid
	public Set<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Set<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
