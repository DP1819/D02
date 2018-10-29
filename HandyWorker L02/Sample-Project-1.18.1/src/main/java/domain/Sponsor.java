
package domain;

import java.util.Set;

public class Sponsor extends Actor {

	//----------Relaciones----------

	private Set<Sponsor>	sponsorships;


	//----------Getters y Setters------

	public Set<Sponsor> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Set<Sponsor> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
