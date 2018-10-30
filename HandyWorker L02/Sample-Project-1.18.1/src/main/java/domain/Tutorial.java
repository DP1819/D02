
package domain;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	// Properties

	private Date				moment;
	private String				title;
	private String				summary;
	private Collection<String>				pictures;

	//-------------Relaciones--------------

	private HandyWorker			handyWorker;
	private Set<Sponsorship>	sponsorships;
	private Set<Section>		section;


	//-------------Getters y Setters--------

	@NotNull
	@Valid
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
	@NotNull
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	@NotNull
	public Collection<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final Collection<String> pictures) {
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
	@NotEmpty
	public Set<Section> getSection() {
		return this.section;
	}

	public void setSection(final Set<Section> section) {
		this.section = section;
	}

}
