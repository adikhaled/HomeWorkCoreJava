package hw5Q3Constructo;
/*Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package, a) Create a class "Student". Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor (use select variables--right click--source to create it). Use only one System.out.println() in parameterized constructor to declare the above variables. Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true. Organize the code. Push in the github. Paste your github link below.*/
public class Student {
// variable declared
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgramer;
	public double grade;
	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}// Parameterize contractor
public Student(String stName, int stId, char sex, boolean isProgramer,double grade) {
	
	this.stName = stName;
	this.stId = stId;
	this.sex = sex;
	this.isProgramer = isProgramer;
	this.grade = grade;
	System.out.println("This is from default Constructor of Student class ");
	System.out.println("Student Name: " + stName + ", Student Id: " + stId + ", Student Sex: " + 'M' + ", JAVA Programer?: " + isProgramer + ", Student Grade: " + grade);
	
} 
}
