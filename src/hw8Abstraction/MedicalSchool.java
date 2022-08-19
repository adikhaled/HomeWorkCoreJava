package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is Non abstract method");
	}

	public MedicalSchool() {// Yes we can create a Constructor inside abstract class.

	}
}
