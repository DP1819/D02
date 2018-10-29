
package domain;

import java.util.Set;

public class Referee extends Actor {

	//----------Relaciones-----------

	private Set<Note>	notes;
	private Set<Report>	reports;


	//----------Getters y Setters-------

	public Set<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(final Set<Note> notes) {
		this.notes = notes;
	}

	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Set<Report> reports) {
		this.reports = reports;
	}

}
