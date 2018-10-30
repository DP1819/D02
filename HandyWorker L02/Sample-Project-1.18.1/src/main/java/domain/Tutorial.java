
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

	//-------------Relaciones--------------

	private HandyWorker			handyWorker;
	private Set<Sponsorship>	sponsorships;
	private Set<Section>		section;


	//-------------Getters y Setters--------

	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

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

	@NotNull
	@Valid
	public Set<Sponsorship> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Set<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

	@NotNull
	@Valid
	public Set<Section> getSection() {
		return this.section;
	}

	public void setSection(final Set<Section> section) {
		this.section = section;
	}

}
