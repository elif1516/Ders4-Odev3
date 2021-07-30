package entities.concretes;

public class Gamer {
	private int id;
	private String nationalityId;
	private int birthOfYear;
	private String firstName;
	private String lastName;
	private String mail;
	public Gamer() {}
	public Gamer(int id, String nationalityId, int birthOfYear, String firstName, String lastName, String mail) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.birthOfYear = birthOfYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
