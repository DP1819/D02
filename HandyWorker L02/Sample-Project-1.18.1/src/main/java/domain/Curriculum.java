
package domain;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Curriculum extends DomainEntity {

	//------------Atributos----------

	private String						ticker;

	//-----------Relaciones------------

	private HandyWorker					handyWorker;
	private PersonalRecord				personalRecord;
	private Set<EducationRecord>		educationRecords;
	private Set<ProfessionalRecord>		profesionalRecords;
	private Set<EndorserRecord>			endorserRecords;
	private Set<MiscellaneousRecord>	miscellaneousRecords;


	//----------Getters y Setters-------

	@NotBlank
	@Pattern(regexp = "^\\d{6}-([A-Z]|\\d){6}$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	// Relationships

	@NotNull
	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}
	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@NotNull
	@Valid
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}
	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}

	@NotNull
	@Valid
	public Set<EducationRecord> getEducationRecords() {
		return this.educationRecords;
	}

	public void setEducationRecords(final Set<EducationRecord> educationRecords) {
		this.educationRecords = educationRecords;
	}

	@NotNull
	@Valid
	public Set<ProfessionalRecord> getProfesionalRecords() {
		return this.profesionalRecords;
	}

	public void setProfesionalRecords(final Set<ProfessionalRecord> profesionalRecords) {
		this.profesionalRecords = profesionalRecords;
	}

	@NotNull
	@Valid
	public Set<EndorserRecord> getEndorserRecords() {
		return this.endorserRecords;
	}

	public void setEndorserRecords(final Set<EndorserRecord> endorserRecords) {
		this.endorserRecords = endorserRecords;
	}

	@NotNull
	@Valid
	public Set<MiscellaneousRecord> getMiscellaneousRecords() {
		return this.miscellaneousRecords;
	}

	public void setMiscellaneousRecords(final Set<MiscellaneousRecord> miscellaneousRecords) {
		this.miscellaneousRecords = miscellaneousRecords;
	}

}
