package hw9Abstraction;
/*
 1)how many keywords are used for the inheritance in Interface, answer by Java comments?  Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word? How many inheritance is possible? Use the Interface -- "University" to answer my questions (University extends College, Hospital) (by multiple line comments).
 
 2)We have 3 abstract class names -- MedicalSchool, EngineeringSchool, and NursingSchool
  */
public interface College {
	public void commonRoom();

	public abstract void laboratory();

	public void languageClub();

	default void Drom() {

	}

	public static void studyRoom() {

	}

}
