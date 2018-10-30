
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Endorsement extends DomainEntity {

	//----------Atributos---------

	private Date		moment;
	private String		comments;

	//-------Relaciones---------

	private Endorsable	sender;
	private Endorsable	receiver;


	//---------Getters y Setters------

	public Endorsable getSender() {
		return this.sender;
	}

	public void setSender(final Endorsable sender) {
		this.sender = sender;
	}

	public Endorsable getReceiver() {
		return this.receiver;
	}

	public void setReceiver(final Endorsable receiver) {
		this.receiver = receiver;
	}

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}