
package domain;

import java.util.Collection;

public class Referee extends Actor {

	//----------Relaciones-----------

	private Collection<Note>	notes;
	private Collection<Report>	reports;


	//----------Getters y Setters-------

	public Collection<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Collection<Report> reports) {
		this.reports = reports;
	}

}
