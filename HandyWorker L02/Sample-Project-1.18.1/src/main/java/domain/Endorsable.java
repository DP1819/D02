
package domain;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Endorsable extends Actor {

	// Relationships
	
	private Set<Endorsement>	endorsements;

	@NotNull
	@Valid
	public Set<Endorsement> getEndorsements() {
		return endorsements;
	}

	public void setEndorsements(Set<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}
	
	
	
}
