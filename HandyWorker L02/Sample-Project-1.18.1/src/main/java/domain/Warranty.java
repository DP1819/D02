
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty extends DomainEntity {

	private String			title;
	private String			terms;
	private String			laws;
	private Boolean			draft;
	private Set<FixupTask>	fixupTasks;
	private Set<Finder>		finders;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getTerms() {
		return this.terms;
	}

	public void setTerms(final String terms) {
		this.terms = terms;
	}

	@NotBlank
	public String getLaws() {
		return this.laws;
	}

	public void setLaws(final String laws) {
		this.laws = laws;
	}

	public Boolean getDraft() {
		return this.draft;
	}

	public void setDraft(final Boolean draft) {
		this.draft = draft;
	}

	public Set<FixupTask> getFixupTasks() {
		return this.fixupTasks;
	}

	public void setFixupTasks(final Set<FixupTask> fixupTasks) {
		this.fixupTasks = fixupTasks;
	}

	public Set<Finder> getFinders() {
		return this.finders;
	}

	public void setFinders(final Set<Finder> finders) {
		this.finders = finders;
	}

}
