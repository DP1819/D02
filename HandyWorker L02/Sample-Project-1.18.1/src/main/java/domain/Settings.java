
package domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

public class Settings extends DomainEntity {

	//-----------Atributos-----------

	private String	systemName;
	private String	banner;
	private String	welcomeMessage;
	private String	spamWords;
	private int		vat;
	private String	countryCode;
	private String	creditCardMakes;
	private int		finderCacheHours;
	private int		maxCacheResults;
	private String	positiveWords;
	private String	negativeWords;


	//--------Getters y Setters-------

	@NotBlank
	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(final String systemName) {
		this.systemName = systemName;
	}

	@NotBlank
	@URL
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	public String getWelcomeMessage() {
		return this.welcomeMessage;
	}

	public void setWelcomeMessage(final String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	@NotBlank
	public String getSpamWords() {
		return this.spamWords;
	}

	public void setSpamWords(final String spamWords) {
		this.spamWords = spamWords;
	}

	@Min(value = 0)
	public int getVat() {
		return this.vat;
	}

	public void setVat(final int vat) {
		this.vat = vat;
	}

	@NotBlank
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	@NotBlank
	public String getCreditCardMakes() {
		return this.creditCardMakes;
	}

	public void setCreditCardMakes(final String creditCardMakes) {
		this.creditCardMakes = creditCardMakes;
	}

	@Range(min = 1, max = 24)
	public int getFinderCacheHours() {
		return this.finderCacheHours;
	}

	public void setFinderCacheHours(final int finderCacheHours) {
		this.finderCacheHours = finderCacheHours;
	}

	@Range(min = 1, max = 100)
	public int getMaxCacheResults() {
		return this.maxCacheResults;
	}

	public void setMaxCacheResults(final int maxCacheResults) {
		this.maxCacheResults = maxCacheResults;
	}

	public String getPositiveWords() {
		return this.positiveWords;
	}

	public void setPositiveWords(final String positiveWords) {
		this.positiveWords = positiveWords;
	}

	public String getNegativeWords() {
		return this.negativeWords;
	}

	public void setNegativeWords(final String negativeWords) {
		this.negativeWords = negativeWords;
	}

}
