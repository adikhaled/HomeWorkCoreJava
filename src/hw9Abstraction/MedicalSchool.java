package hw9Abstraction;

// An abstract Class can inherit only one abstract class or one regular class by extends keyword.
// An abstract class can't inherit by extends keyword.
// Implement keyword is used to inherit interface in abstract class.
// An abstract class can inherit more then one interface.
// An abstract class cannot inherit a regular class or abstract class by Implements keyword.
public abstract class MedicalSchool extends EngineeringSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is Non abstract method");
	}

	public MedicalSchool() {
	}
}
