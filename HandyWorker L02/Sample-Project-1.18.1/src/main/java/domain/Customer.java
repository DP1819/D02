
package domain;

import org.hibernate.validator.constraints.Range;

public class Customer extends Endorsable {

	private Double	score;


	@Range(min = -1, max = 1)
	public Double getScore() {
		return this.score;
	}

	public void setScore(final Double score) {
		this.score = score;
	}

}
