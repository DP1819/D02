
package domain;

import org.hibernate.validator.constraints.Range;

public class Customer extends Endorsable {

	//---------Atributos-----------

	private Double	score;


	//----------Getters y Setters------

	@Range(min = -1, max = 1)
	public Double getScore() {
		return this.score;
	}

	public void setScore(final Double score) {
		this.score = score;
	}

}
