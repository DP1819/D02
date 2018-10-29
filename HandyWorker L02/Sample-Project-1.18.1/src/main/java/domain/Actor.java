
package domain;

import java.util.Set;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Actor extends DomainEntity {

	//----------------Atributos-------------------

	private String				name;
	private String				middleName;
	private String				surname;
	private String				photo;
	private String				email;
	private String				phone;
	private String				address;
	private Boolean				banned;
	private Boolean				suspicious;

	//--------------Relaciones-----------

	private Set<Message>		messages;
	private Set<Folder>			folders;
	private Set<SocialProfile>	socialProfiles;


	//-----------Getters y Setters------

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Set<Message> messages) {
		this.messages = messages;
	}

	public Set<Folder> getFolders() {
		return this.folders;
	}

	public void setFolders(final Set<Folder> folders) {
		this.folders = folders;
	}

	public Set<SocialProfile> getSocialProfiles() {
		return this.socialProfiles;
	}

	public void setSocialProfiles(final Set<SocialProfile> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Pattern(regexp = "^[0-9]{4,}$")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public Boolean getBanned() {
		return this.banned;
	}

	public void setBanned(final Boolean banned) {
		this.banned = banned;
	}

	public Boolean getSuspicious() {
		return this.suspicious;
	}

	public void setSuspicious(final Boolean suspicious) {
		this.suspicious = suspicious;
	}

}
