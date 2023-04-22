
public class Employee {

	// Non-static/Instance variables
	int eno;
	String firstName;
	String lastName;
	String email;
	double esal;
	long mobileNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		System.out.println(emp.eno + "\t" + emp.firstName + "\t" + emp.lastName + "\t" + emp.email + "\t" + emp.esal
				+ "\t" + emp.mobileNumber);

	}

}
