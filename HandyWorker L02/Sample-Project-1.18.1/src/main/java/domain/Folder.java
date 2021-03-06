
package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.NotBlank;

public class Folder extends DomainEntity {

	//------------Atributos---------

	private String				name;
	private Boolean				system;

	//------------Relaciones----------

	private Collection<Message>	messages;
	private Collection<Folder>	childFolder;
	private Folder				parentFolder;


	//----------Getters y Setters-----

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Boolean getSystem() {
		return this.system;
	}

	public void setSystem(final Boolean system) {
		this.system = system;
	}

	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	public Collection<Folder> getChildFolder() {
		return this.childFolder;
	}

	public void setChildFolder(final Collection<Folder> childFolder) {
		this.childFolder = childFolder;
	}

	public Folder getParentFolder() {
		return this.parentFolder;
	}

	public void setParentFolder(final Folder parentFolder) {
		this.parentFolder = parentFolder;
	}

}
