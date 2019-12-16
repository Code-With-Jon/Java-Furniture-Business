//import package
package furniturebusiness;

//Create Address Class
public class Address {
	// Class variables
	private String street;
	private String aptNr;
	private String city;
	private int zipCode;
	private String state;

	// Create constructor
	public Address(String street, String aptNr, String city, int zipCode, String state) {
		this.street = street;
		this.aptNr = aptNr;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	// Getters & Setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAptNr() {
		return aptNr;
	}

	public void setAptNr(String aptNr) {
		this.aptNr = aptNr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Address [street=" + street + ", aptNr=" + aptNr + ", city=" + city + ", zipCode=" + zipCode + ", state="
				+ state + "]";
	}

	// Override hashCode method for HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aptNr == null) ? 0 : aptNr.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	// Override equals method for HashMap
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (aptNr == null) {
			if (other.aptNr != null)
				return false;
		} else if (!aptNr.equals(other.aptNr))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}
}
