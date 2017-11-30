package session9assignments; //Package declaration

/**
 * This class Employee is used to declare and initialize employee code and
 * employee names using constructor.
 *
 */
public class Employee 
{
	int EmpCode; // Declaration of variable for employee codes ->key
	String EmpName; // Declaration of variable for employee names -> value

	public Employee(int empCode, String empName) // Parameterized Constructor to accept Employee code and name
	{
		this.EmpCode = empCode; // Initialization of data member EmpCode using this keyword
		this.EmpName = empName; // Initialization of data member EmpName using this keyword
	} // Constructor closed
} // End of class Employee
