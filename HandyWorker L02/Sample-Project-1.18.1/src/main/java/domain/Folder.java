
package domain;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

public class Folder extends DomainEntity {

	//------------Atributos---------

	private String			name;
	private Boolean			system;

	//------------Relaciones----------

	private Set<Message>	messages;


	//----------Getters y Setters-----
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Set<Message> messages) {
		this.messages = messages;
	}

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

}
