package hw9Abstraction;

/* 
 *A regular class can inherit only one regular class or one abstract class by extends keyword.
 
 *An regular class can't inherit an interface by extends key word.
 
 *Implements keyword is used to inherit interface in regular class.
 
 *A regular class can inherit more then one interface.
 
 *A Regular class cannot inherit a regular class or abstract class by implement keyword.
 */

public class ColumbiaUniversity extends MedicalSchool {

	public void biology() {

		System.out.println("This a Non abstract class");

	}

	public ColumbiaUniversity() {
		// Default are allowed only in interface, not in regular class

	}

	@Override
	public void anatomyLab() {

	}

	@Override
	public void mechanicalLab() {

	}
}
