
package domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Section extends DomainEntity {

	//------------Atributos------------

	private String		title;
	private String		text;
	private String		pictures;
	private int			numberOrder;

	//------------Relaciones-----------

	private Tutorial	tutorial;


	//-----------Getters y Setters-------

	public Tutorial getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Tutorial tutorial) {
		this.tutorial = tutorial;
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getText() {
		return this.text;
	}

	public void setText(final String text) {
		this.text = text;
	}

	@URL
	public String getPictures() {
		return this.pictures;
	}

	public void setPictures(final String pictures) {
		this.pictures = pictures;
	}

	@Min(0)
	public int getNumberOrder() {
		return this.numberOrder;
	}

	public void setNumberOrder(final int numberOrder) {
		this.numberOrder = numberOrder;
	}

}
