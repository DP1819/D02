
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	//--------Atributos-------------

	private String		name;
	//private String		child;
	//private String		parent;

	//------------Relaciones-------------

	private FixupTask	fixupTask;
	private Set<Finder>	finders;


	//--------Getters y Setters-------

	public Set<Finder> getFinders() {
		return this.finders;
	}

	public void setFinders(final Set<Finder> finders) {
		this.finders = finders;
	}

	public FixupTask getFixupTask() {
		return this.fixupTask;
	}

	public void setFixupTask(final FixupTask fixupTask) {
		this.fixupTask = fixupTask;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
