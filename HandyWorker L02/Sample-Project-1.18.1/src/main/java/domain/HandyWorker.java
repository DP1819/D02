
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class HandyWorker extends Endorsable {

	//------------Atributos---------

	private String				make;
	private String				score;

	//-------------Relaciones---------

	private Curriculum			curriculum;
	private Tutorial			tutorials;
	private Set<Note>			notes;
	private Set<Application>	applications;


	//-------------Getters y Setters----

	public Set<Note> getNotes() {
		return this.notes;
	}

	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	public Tutorial getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Tutorial tutorials) {
		this.tutorials = tutorials;
	}

	public void setNotes(final Set<Note> notes) {
		this.notes = notes;
	}

	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(final Set<Application> applications) {
		this.applications = applications;
	}

	@NotBlank
	public String getMake() {
		return this.make;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	@Range(min = -1, max = 1)
	public String getScore() {
		return this.score;
	}

	public void setScore(final String score) {
		this.score = score;
	}

}
