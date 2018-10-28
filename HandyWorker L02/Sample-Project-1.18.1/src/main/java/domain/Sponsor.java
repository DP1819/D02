
package domain;

import java.util.Set;

public class Sponsor extends Actor {

	private Set<Sponsor>	sponsorships;


	public Set<Sponsor> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Set<Sponsor> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
