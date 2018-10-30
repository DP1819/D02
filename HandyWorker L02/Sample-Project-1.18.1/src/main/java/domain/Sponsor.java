
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Sponsor extends Actor {

	//----------Relaciones----------

	private Collection<Sponsor>	sponsorships;


	//----------Getters y Setters------

	@Valid
	@NotNull
	public Collection<Sponsor> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Collection<Sponsor> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
