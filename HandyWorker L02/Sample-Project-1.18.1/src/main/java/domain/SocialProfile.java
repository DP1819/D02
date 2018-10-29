
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class SocialProfile extends DomainEntity {

	//----------Atributos---------

	private String	nick;
	private String	networkName;
	private String	profile;


	//--------Getters y Setters------

	@NotBlank
	public String getNick() {
		return this.nick;
	}

	public void setNick(final String nick) {
		this.nick = nick;
	}

	@NotBlank
	public String getNetworkName() {
		return this.networkName;
	}

	public void setNetworkName(final String networkName) {
		this.networkName = networkName;
	}

	@URL
	@NotBlank
	public String getProfile() {
		return this.profile;
	}

	public void setProfile(final String profile) {
		this.profile = profile;
	}

}
