
package domain;

import java.util.Collection;
import java.util.Date;


import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Finder extends DomainEntity {

	//-------------Atributos---------

	private String			keyword;
	private Double			minPrice;
	private Double			maxPrice;
	private Date			start;
	private Date			end;

	//--------------Relaciones--------

	
	private Collection<Warranty>	warranties;
	private Collection<Category>	categories;


	//--------------Getters y Setters------

	@Valid
	@NotNull
	public Collection<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Collection<Category> categories) {
		this.categories = categories;
	}

	@Valid
	@NotNull
	public Collection<Warranty> getWarranties() {
		return this.warranties;
	}

	public void setWarranties(final Collection<Warranty> warranties) {
		this.warranties = warranties;
	}



	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(final String keyword) {
		this.keyword = keyword;
	}

	@Min(value = 0)
	public Double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(final Double minPrice) {
		this.minPrice = minPrice;
	}

	@Min(value = 0)
	public Double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(final Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

}
