
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class FixupTask extends Ticketable{

	//-------------Atributos----------
	
	private Date				moment;
	private String				description;
	private String				address;
	private double				maximumPrice;
	private Date				start;
	private Date				end;

	//------------Relaciones----------


	private Collection<Complaint>		complaints;
	private Customer					customer;
	private Category					category;
	private Warranty					warranty;
	


	//------------Getters y Setters-------

	@NotNull
	@Valid
	public Category getCategory() {
		return this.category;
	}

	public void setCategories(final Category category) {
		this.category = category;
	}

	@NotNull
	@Valid
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

	@NotNull
	@Valid
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	@NotNull
	@Valid
	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@Past
	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@NotNull
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	@NotNull
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@Digits(fraction = 0, integer = 2)
	@Min(value = 0)
	public double getMaximumPrice() {
		return this.maximumPrice;
	}

	public void setMaximumPrice(final double maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	@NotNull
	public Date getStart() {
		return this.start;
	}

	public void setStart(final Date start) {
		this.start = start;
	}

	@NotNull
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

}
