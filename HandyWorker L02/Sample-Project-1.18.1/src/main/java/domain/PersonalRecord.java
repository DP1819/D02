
package domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends DomainEntity {

	//----------Atributos------------

	private String	fullName;
	private String	photo;
	private String	email;
	private String	phone;
	private String	linkedlnProfile;


	//-----------Getters y Setters------

	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	@NotBlank
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

	@NotBlank
	@Pattern(regexp = "^((\\+\\d{1,3})(\\(\\d{1,3}\\))?)?\\d{4,}$")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	@NotBlank
	@URL
	public String getLinkedlnProfile() {
		return this.linkedlnProfile;
	}

	public void setLinkedlnProfile(final String linkedlnProfile) {
		this.linkedlnProfile = linkedlnProfile;
	}

}
