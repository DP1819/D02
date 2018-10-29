
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Sponsorship extends DomainEntity {

	//-----------Atributos----------

	private String			banner;
	private String			page;
	private CreditCard		creditCard;

	//---------Relaciones--------

	private Sponsor			sponsor;
	private Set<Tutorial>	tutorials;


	//---------Getters y Setters------

	public Set<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Set<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	public Sponsor getSponsor() {
		return this.sponsor;
	}

	public void setSponsor(final Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	@URL
	@NotBlank
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@URL
	@NotBlank
	public String getPage() {
		return this.page;
	}

	public void setPage(final String page) {
		this.page = page;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
