package nl.yc2309.javahotel.domein;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Column(length = 100)
	protected String wachtwoord;

	@Column(length = 100)
	protected String voornaam;
	
	@Column(length = 100)
	protected String achternaam;
	
	@Column(length = 100)
	protected String email;

	// Dit is een unieke code (Random string) die aangemaakt wordt tijdens het inloggen
	@Column(length = 100, unique = true, nullable = true)
	protected String token;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	public abstract String getRole();

}
