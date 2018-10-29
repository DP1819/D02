
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Report extends DomainEntity {

	//-----------Atributos-----------

	private Date	moment;
	private String	description;
	private String	attachments;
	private Boolean	draft;

	//-----------Relaciones----------

	private Referee	referee;
	private Note	note;


	//----------Getters y Setters-------

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public Referee getReferee() {
		return this.referee;
	}

	public void setReferee(final Referee referee) {
		this.referee = referee;
	}

	public Note getNote() {
		return this.note;
	}

	public void setNote(final Note note) {
		this.note = note;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@URL
	public String getAttachments() {
		return this.attachments;
	}

	public void setAttachments(final String attachments) {
		this.attachments = attachments;
	}

	public Boolean getDraft() {
		return this.draft;
	}

	public void setDraft(final Boolean draft) {
		this.draft = draft;
	}

}
