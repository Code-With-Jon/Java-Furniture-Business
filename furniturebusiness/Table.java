//Import package
package furniturebusiness;

//Create Furniture Class - Implements Furniture
public class Table implements Furniture {
	// Class variables
	private String table;
	private int price;
	private int modelNumber;

	// Create Constructor
	public Table(String table, int price, int modelNumber) {
		this.table = table;
		this.price = price;
		this.modelNumber = modelNumber;
	}

	// Getters
	@Override
	public String getName() {
		return table;
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
		return "Table [Price: " + price + ", Model Number: " + modelNumber + "]";
	}

	// Override hashCode method for HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((table == null) ? 0 : table.hashCode());
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
		Table other = (Table) obj;
		if (table == null) {
			if (other.table != null)
				return false;
		} else if (!table.equals(other.table))
			return false;
		return true;
	}
}
