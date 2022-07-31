package hw4JavaVariables;

/*Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's meaningful info. Create another class AboutMeTest. Instantiate AboutMe class under main method. Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and push to the github and paste the link of github below. [Mark distribution (100) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 15  variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 10, organize code and other-- 25]. push your code to github -- 10. share the package link below.*/
//Variables Declared
public class AboutMe {
	public String name;
	public byte age;
	public short myAppartmentRent;
	public int myAnnualIncome;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	// Constructor declared
	public AboutMe() {
		System.out.println("Our information is below");
	}

//method implemented
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy Appartmenr Rent: " + myAppartmentRent
				+ "\nMy Annual Income: " + myAnnualIncome + "\nMy Bank Balance is: " + myBankBalance
				+ "\nMy Height is: " + myHeight + "\nMy Grade: " + myGrade + "\nMy Sex: " + sex
				+ "\nI am an US Citizen:" + usCitizen);

	}

}