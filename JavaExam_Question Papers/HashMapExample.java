// Import the HashMap class
import java.util.HashMap;

public class MyClass {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
	
	// Print the capitalCities hashmap to the console
    System.out.println(capitalCities);
	
	// Get the element
	capitalCities.get("England");
	
	// Insert an element
	capitalCities.put("Finland", "Helsinki");
	
	// Replace a value
	
	
	// Remove the element
	capitalCities.remove("England");
	
	// Clear the map
	capitalCities.clear();
	
	// Size of the hashmap
	capitalCities.size();	// 5 
	
	// Loop through hashmap keys
	for (String i : capitalCities.keySet()){
		System.out.println(i);
	}
	
	// Loop through hashmap values
	for (String i : capitalCities.values()) {
		System.out.println(i);	
	}
	
	// Print both keys and values of hashmap
	for (String i : capitalCities.keySet()) {
		System.out.println("key: " + i + " value: " + capitalCities.get(i));
	}
  }
}