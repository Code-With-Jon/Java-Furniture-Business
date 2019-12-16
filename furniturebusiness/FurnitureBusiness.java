//import package
package furniturebusiness;

//import library
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Furniture Business Class
public class FurnitureBusiness {
	// Create class variables
	private static HashMap<Customer, List<Furniture>> map_Customer_Furniture = new HashMap<>();

	// Constructor
	public FurnitureBusiness() {

	}

	// Purchase Method - If customer doesn't exist, add customer and Furniture.
	// If Customer does, just add Furniture associated to appropriate customer.
	public static void purchase(Customer c, Furniture f) {
		List<Furniture> temp_List;
		if (!map_Customer_Furniture.containsKey(c)) {
			temp_List = new ArrayList<Furniture>();
			temp_List.add(f);
			map_Customer_Furniture.put(c, temp_List);
		}

		temp_List = map_Customer_Furniture.get(c);
		temp_List.add(f);
		map_Customer_Furniture.put(c, temp_List);
	}

	// hasBought method returns T/F if appropriate customer has purchased a
	// particular furniture item in the past.
	public static boolean hasBought(Customer c, Furniture f) {
		if (map_Customer_Furniture.containsKey(c)) {
			return map_Customer_Furniture.get(c).contains(f);
		}
		return false;
	}

	// getPurchases method returns a list of items an appropriate customer has
	// purchased before.
	public static List<Furniture> getPurchases(Customer c) {
		return map_Customer_Furniture.get(c);
	}

	// moneySpent method - if a customer hasn't purchased anything return 0.
	// If a customer has purchased furniture items, add up total prices and return
	// value.
	public static int moneySpent(Customer c) {
		if (!map_Customer_Furniture.containsKey(c)) {
			return 0;
		}
		int quantity = map_Customer_Furniture.get(c).size();
		int total_money_spent = 0;
		for (int i = 0; i < quantity; i++) {
			total_money_spent += map_Customer_Furniture.get(c).get(i).getPrice();

		}
		System.out.print("Total Money Spent: $");
		return total_money_spent;

	}

	// Getters & Setters for HashMap
	public static HashMap<Customer, List<Furniture>> getMap_Customer_Furniture(Customer c2) {
		return map_Customer_Furniture;
	}

	public void setMap_Customer_Furniture(HashMap<Customer, List<Furniture>> map_Customer_Furniture) {
		FurnitureBusiness.map_Customer_Furniture = map_Customer_Furniture;
	}

	// MAIN
	public static void main(String[] args) {
		// Create 3 customers
		Customer c1 = new Customer(123, "Jon", new Address("a1", "num1", "city", 1111, "CA"),
				new Date(System.currentTimeMillis()));
		Customer c2 = new Customer(456, "Bill", new Address("a2", "num2", "city", 1111, "CA"),
				new Date(System.currentTimeMillis()));
		Customer c3 = new Customer(789, "Tom", new Address("a3", "num3", "city", 1111, "CA"),
				new Date(System.currentTimeMillis()));
		// Create a temp list and import all customers
		List<Customer> temp_Customers = new ArrayList<Customer>();
		temp_Customers.add(c1);
		temp_Customers.add(c2);
		temp_Customers.add(c3);
		// Create 5 furniture items
		Recliner r1 = new Recliner("Recliner", 5, 666);
		Chair chair = new Chair("Chair", 2, 123);
		Table table = new Table("Table", 1, 555);
		Sofa sofa = new Sofa("Sofa", 10, 234);
		Recliner r2 = new Recliner("r2", 44, 88);

		// Create a temp list for Furniture items & add all items to temp list
		List<Furniture> temp_List = new ArrayList<Furniture>();
		temp_List.add(r1);
		temp_List.add(r2);
		temp_List.add(chair);
		temp_List.add(sofa);
		temp_List.add(table);
		// C1 purchases 3 items, C2 & C3 purchase 1 item each.
		FurnitureBusiness.purchase(c1, chair);
		FurnitureBusiness.purchase(c1, r1);
		FurnitureBusiness.purchase(c1, sofa);
		FurnitureBusiness.purchase(c2, table);
		FurnitureBusiness.purchase(c3, r2);
		// Nested for loop to print the list of customers, Items,
		// and whether an item has been purchased by that customer.
		for (int i = 0; i < temp_Customers.size(); i++) {
			for (int j = 0; j < temp_List.size(); j++) {
				System.out.println(temp_Customers.get(i));
				System.out.println(temp_List.get(j));
				System.out.println(hasBought(temp_Customers.get(i), temp_List.get(j)));
			}
		}
		// for loop to print out a list of items purchased by each customer,
		// and print total money spent on all items purchased.
		for (int i = 0; i < temp_Customers.size(); i++) {
			System.out.println(getPurchases(temp_Customers.get(i)));
			System.out.println(moneySpent(temp_Customers.get(i)));
		}
	}
}
