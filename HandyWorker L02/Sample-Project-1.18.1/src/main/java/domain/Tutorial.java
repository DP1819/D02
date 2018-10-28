
package domain;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	// Properties
	
	private Date				moment;
	private String				title;
	private String				summary;
	private String				pictures;
	

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	public String getPictures() {
		return this.pictures;
	}

	public void setPictures(final String pictures) {
		this.pictures = pictures;
	}

	// Relationships
	
	private Set<Sponsorship>	sponsorships;
	private Set<Section>		section;
	
	@NotNull
	@Valid
	public Set<Sponsorship> getSponsorships() {
		return sponsorships;
	}

	public void setSponsorships(Set<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

	@NotNull
	@Valid
	public Set<Section> getSection() {
		return section;
	}

	public void setSection(Set<Section> section) {
		this.section = section;
	}

	
	
}
