
package domain;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Min;

public class Finder extends DomainEntity {

	//-------------Atributos---------

	private String			keyword;
	private Double			minPrice;
	private Double			maxPrice;
	private Date			start;
	private Date			end;

	//--------------Relaciones--------

	private HandyWorker		handyWorker;
	private Set<Warranty>	warranties;
	private Set<Category>	categories;


	//--------------Getters y Setters------

	public Set<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Warranty> getWarranties() {
		return this.warranties;
	}

	public void setWarranties(final Set<Warranty> warranties) {
		this.warranties = warranties;
	}

	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
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
