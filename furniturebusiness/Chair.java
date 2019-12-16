//Import package
package furniturebusiness;

//Create Chair Class - Implements Furniture
public class Chair implements Furniture {
	// Create class variables
	private String chair;
	private int price;
	private int modelNumber;

	// Create Constructor
	public Chair(String chair, int price, int modelNumber) {
		this.chair = chair;
		this.price = price;
		this.modelNumber = modelNumber;
	}

	// Getters
	@Override
	public String getName() {
		return chair;
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
		return "Chair [Price: " + price + ", Model Number: " + modelNumber + "]";
	}

	// Override hashCode method for HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chair == null) ? 0 : chair.hashCode());
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
		Chair other = (Chair) obj;
		if (chair == null) {
			if (other.chair != null)
				return false;
		} else if (!chair.equals(other.chair))
			return false;
		return true;
	}
}
