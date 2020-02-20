import java.util.*;  

public class HelloWorld{

     public static void main(String []args){
// Create a list and assign it to null
List studentList = new ArrayList();

// adds data inside the list one by one
studentList.add("Aravind");
studentList.add("Bhavana");
studentList.add("Chandru");
studentList.add("Divya");

System.out.println("----------- Actual List------------");
System.out.println(studentList);
System.out.println("-----------------------------------");
System.out.println(" ");

// removes data from the list. 
// This will print remaining objects in the list
studentList.remove("Chandru");
System.out.println("-----------------------------------");
System.out.println("---- After removing 'Chandru' -----");
System.out.println(studentList);
System.out.println("-----------------------------------");
System.out.println(" ");

// removes data based on index.
// This will remove first element "Aravind"
System.out.println("--- After removing first element ---");
studentList.remove(0);
System.out.println(studentList);
System.out.println("-----------------------------------");
System.out.println(" ");

// Clears the list completely
studentList.clear();
System.out.println("---------- After clearing ---------");
System.out.println(studentList);
System.out.println("-----------------------------------");
System.out.println(" ");

// Gets the size of the list
// size = 2 since we removed two items from list
int size = studentList.size(); 
System.out.println("---------- SIZE ---------");
System.out.println(size);
System.out.println("-----------------------------------");
     }
}