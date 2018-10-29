
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Note extends DomainEntity {

	//-----------Atributos-----------

	private Date		moment;
	private String		writerComment;
	private String		otherComments;

	//----------Relaciones-----------

	private HandyWorker	handyWorker;
	private Customer	customer;
	private Referee		refee;


	//------------Getters y Setters-------

	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Referee getRefee() {
		return this.refee;
	}

	public void setRefee(final Referee refee) {
		this.refee = refee;
	}

	public Report getReport() {
		return this.report;
	}

	public void setReport(final Report report) {
		this.report = report;
	}


	private Report	report;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getWriterComment() {
		return this.writerComment;
	}

	public void setWriterComment(final String writerComment) {
		this.writerComment = writerComment;
	}

	public String getOtherComments() {
		return this.otherComments;
	}

	public void setOtherComments(final String otherComments) {
		this.otherComments = otherComments;
	}

}
