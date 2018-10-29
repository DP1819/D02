
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	//--------Atributos-------------

	private String	name;


	//--------Getters y Setters-------

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
