
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

public class Curriculum extends DomainEntity {

	private String						ticker;
	private HandyWorker					handyWorker;
	private PersonalRecord				personalRecord;
	private Set<EducationRecord>		educationRecords;
	private Set<ProfessionalRecord>		profesionalRecords;
	private Set<EndorserRecord>			endorserRecords;
	private Set<MiscellaneousRecord>	miscellaneousRecords;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

}
