
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Phase extends DomainEntity {

	//----------Atributos-----------

	private String		title;
	private String		description;
	private Date		start;
	private Date		end;

	//------------Relaciones-----------

	private HandyWorker	handyWorker;


	//---------Getters y Setters-----
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(final Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

}
