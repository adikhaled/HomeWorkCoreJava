package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is default Constructor from Father class");
	}
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Name: " + name + ",\nFather Age: " + age + ",\nFather Sex " + sex
				+ ",\nFather US Citizen" + usCitizen);
	}
	public void father() {
		System.out.println("This is a void type method from Father class");
	}
	public void FatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Name: " + name + ",\nFather Age: " + age + ",\nFather Sex " + sex
				+ ",\nFather US Citizen" + usCitizen);
	}
}
