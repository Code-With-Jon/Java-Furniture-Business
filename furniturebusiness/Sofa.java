//Import package
package furniturebusiness;

//Create Sofa Class - Implements Furniture
public class Sofa implements Furniture {
	// Class variables
	private String sofa;
	private int price;
	private int modelNumber;

	// Create constructor
	public Sofa(String sofa, int price, int modelNumber) {
		this.sofa = sofa;
		this.price = price;
		this.modelNumber = modelNumber;
	}

	// Getters
	@Override
	public String getName() {
		return sofa;
	}

	@Override
	public int getModelNr() {
		return modelNumber;
	}

	public int getPrice() {
		return price;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Sofa [Price: " + price + ", Model Number: " + modelNumber + "]";
	}

	// Override hashCode method for HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sofa == null) ? 0 : sofa.hashCode());
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
		Sofa other = (Sofa) obj;
		if (sofa == null) {
			if (other.sofa != null)
				return false;
		} else if (!sofa.equals(other.sofa))
			return false;
		return true;
	}
}
