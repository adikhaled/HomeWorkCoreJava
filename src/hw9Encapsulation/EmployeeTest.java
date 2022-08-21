package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Khaled");
		employee.setAge(25);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmployee Sex: " + employee.getSex() + "\nEmployee US Citizen: " + employee.isUsCitizen());
	}

}
