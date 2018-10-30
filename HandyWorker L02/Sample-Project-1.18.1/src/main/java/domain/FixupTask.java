
package domain;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class FixupTask extends DomainEntity {

	//-------------Atributos----------
	private String				ticker;
	private Date				moment;
	private String				description;
	private String				address;
	private Double				maximumPrice;
	private Date				start;
	private Date				end;

	//------------Relaciones----------

	private Set<Application>	applications;
	private Set<Complaint>		complaints;
	private WorkPlan			workplan;
	private Customer			customer;
	private Set<Category>		categories;


	//------------Getters y Setters-------

	public Set<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(final Set<Application> applications) {
		this.applications = applications;
	}

	public Set<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Set<Complaint> complaints) {
		this.complaints = complaints;
	}

	public WorkPlan getWorkplan() {
		return this.workplan;
	}

	public void setWorkplan(final WorkPlan workplan) {
		this.workplan = workplan;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Category getName() {
		return this.name;
	}

	public void setName(final Category name) {
		this.name = name;
	}

	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}


	private Category	name;
	private Warranty	warranty;


	@NotBlank
	//@Unique
	@Pattern(regexp = "^[0-9]{6}-([A-Z]|[0-9]) {6}$)")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Past
	public Date getMoment() {
		return this.moment;
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

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@Digits(fraction = 0, integer = 2)
	@Min(value = 0)
	public Double getMaximumPrice() {
		return this.maximumPrice;
	}

	public void setMaximumPrice(final Double maximumPrice) {
		this.maximumPrice = maximumPrice;
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
