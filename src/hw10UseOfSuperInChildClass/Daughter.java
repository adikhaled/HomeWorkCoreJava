package hw10UseOfSuperInChildClass;
// b) Create a class name 'Daughter', declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Now, Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. Use 'FamilyName' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and initialize in a TestFamily Class. Paste GitHub link below.
public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		System.out.println();
	}

	public Daughter(String birthMonth,int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println();
	}
	public void daughter() {
		System.out.println();
	}
	public void daughterInfo(String birthMonth,int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println();
	}

}
