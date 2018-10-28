
package domain;

import java.util.Set;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Complaint extends DomainEntity {

	private String		ticker;
	private String		moment;
	private String		description;
	private String		attachments;
	private Set<Report>	reports;
	private Customer	customer;
	private FixupTask	fixuptask;


	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Set<Report> reports) {
		this.reports = reports;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public FixupTask getFixuptask() {
		return this.fixuptask;
	}

	public void setFixuptask(final FixupTask fixuptask) {
		this.fixuptask = fixuptask;
	}

	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Past
	public String getMoment() {
		return this.moment;
	}

	public void setMoment(final String moment) {
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

}
