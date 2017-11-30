package session9assignments; //Package declaration

import java.util.HashMap; //Imports HashMap class from java.util package
import java.util.Set; //Imports Set class from java.util package

/**
 * This is an application having a Generic HashMap with EmpCode as key and
 * EmpName as value.
 *
 */
public class EmployeeHashMap 
{

	public static void main(String[] args) // This is the main method
	{
		/*
		 * Objects of class type Employee created to pass Employee code and names as
		 * arguments
		 */
		Employee employee1 = new Employee(100, "Avinash");
		Employee employee2 = new Employee(101, "shabnam");
		Employee employee3 = new Employee(102, "Naveen");
		Employee employee4 = new Employee(103, "Marie");

		/* HashMap for Employee Code as key and Employee Name as value */
		HashMap<Integer, String> employee_hash_map = new HashMap<Integer, String>();

		/* Storing key and values by calling the employee values from Generic HashMap */
		employee_hash_map.put(employee1.EmpCode, employee1.EmpName);
		employee_hash_map.put(employee2.EmpCode, employee2.EmpName);
		employee_hash_map.put(employee3.EmpCode, employee3.EmpName);
		employee_hash_map.put(employee4.EmpCode, employee4.EmpName);

		/*
		 * Storing all the keys in one variable using Set function to access each one's
		 * value
		 */
		Set<Integer> key = employee_hash_map.keySet();

		System.out.println("The Employee names are: "); // Display message
		for (Integer EmpKey : key) // For loop to access all the values i.e. employee names
		{
			System.out.println(employee_hash_map.get(EmpKey)); // Prints the employee names

		} // for loop closed

	} // main method closed

} // Class closed
