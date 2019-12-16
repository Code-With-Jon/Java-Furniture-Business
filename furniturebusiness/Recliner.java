//import package
package furniturebusiness;

//Create Recliner Class implement Furniture
public class Recliner implements Furniture {
	// Class variables
	private String recliner;
	private int price;
	private int modelNumber;

	// Create constructor
	public Recliner(String recliner, int price, int modelNumber) {
		this.recliner = recliner;
		this.price = price;
		this.modelNumber = modelNumber;
	}

	// Getters
	@Override
	public String getName() {
		return recliner;
	}

	@Override
	public int getModelNr() {

		return modelNumber;
	}

	@Override
	public int getPrice() {
		return price;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Recliner [Price: " + price + ", Model Number: " + modelNumber + "]";
	}

	// Override hashCode method for HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recliner == null) ? 0 : recliner.hashCode());
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
		Recliner other = (Recliner) obj;
		if (recliner == null) {
			if (other.recliner != null)
				return false;
		} else if (!recliner.equals(other.recliner))
			return false;
		return true;
	}
}
