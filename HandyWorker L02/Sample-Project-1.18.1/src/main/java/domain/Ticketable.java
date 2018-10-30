package domain;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;



public class Ticketable  extends DomainEntity{

	//----------------Atributos---------------
	private String	ticker;

	
	
	//--------getters y setters------------
	@NotBlank
	@Column(unique=true)
	@Pattern(regexp="^\\d{6}-([A-Z]|\\d){6}$")x//comprobar patrón
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
}
