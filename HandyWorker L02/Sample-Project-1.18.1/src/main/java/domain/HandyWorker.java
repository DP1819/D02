
package domain;

import java.util.Collection;
import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class HandyWorker extends Endorsable {

	//------------Atributos---------

	private String					make;
	private Double					score;

	//-------------Relaciones---------

	private Curriculum				curriculum;
	private Finder					finder;
	private Collection<Tutorial>	tutorials;
	private Collection<Note>		notes;
	private Collection<Application>	applications;
	private Collection<WorkPlan>	workPlans;


	//-------------Getters y Setters----

	public Collection<Note> getNotes() {
		return this.notes;
	}

	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	public void setNotes(final Set<Note> notes) {
		this.notes = notes;
	}

	@NotBlank
	public String getMake() {
		return this.make;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	@Range(min = -1, max = 1)
	public Double getScore() {
		return this.score;
	}

	public void setScore(final Double score) {
		this.score = score;
	}

	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	public Collection<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Collection<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	public Collection<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(final Collection<Application> applications) {
		this.applications = applications;
	}

	public Collection<WorkPlan> getWorkPlans() {
		return this.workPlans;
	}

	public void setWorkPlans(final Collection<WorkPlan> workPlans) {
		this.workPlans = workPlans;
	}

	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

}
