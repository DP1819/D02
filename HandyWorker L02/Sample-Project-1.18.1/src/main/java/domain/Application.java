
package domain;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Application extends DomainEntity {

	//----------Atributos----------
	private Double		price;
	private Date		moment;
	private String		status;
	private String		workerComments;
	private String		customerComments;
	private CreditCard	creditCard;

	//----------Relaciones---------

	private HandyWorker	handyWorker;


	//-----------Getters y Setters---------

	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@Digits(fraction = 0, integer = 2)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@Pattern(regexp = "^(PENDING)|(ACCEPTED)|(REJECTED)$)")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getWorkerComments() {
		return this.workerComments;
	}

	public void setWorkerComments(final String workerComments) {
		this.workerComments = workerComments;
	}

	public String getCustomerComments() {
		return this.customerComments;
	}

	public void setCustomerComments(final String customerComments) {
		this.customerComments = customerComments;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
