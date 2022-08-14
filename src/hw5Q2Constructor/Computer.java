package hw5Q2Constructor;

public class Computer {
	// variable declare
	// Global variable
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	// default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");

	} // Parameterize constructor

	public Computer(String brand, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		System.out.println("This Computer brand: " + brand);

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		System.out.println("My Computer brand is : " + brand + ", My Computer Model is: " + model
				+ ", My Computer operating system is: " + operatingSystem + ", My Computer price is: " + price
				+ ", My Computer grade is: " + grade + ", My Computer is Made in Usa: " + madeInUsa + ".");
	}
}