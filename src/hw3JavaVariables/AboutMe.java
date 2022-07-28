package hw3JavaVariables;


public class AboutMe {
// variable initialize
	public String name = "Khaled Adi";
	public byte age = 27;
	public short myAppartmentRent = 2400;
	public int mySalary = 500000;
	public long myBankBalance = 154865987453945l;
	public float myHight = 5.6f;
	public double myGrade = 4.29;
	public char mySex = 'M';
	public boolean usCitizen = true;
	
	public static void main(String[] args) {
		AboutMe me=new AboutMe();
		
		
		System.out.println("My name is : " + me.name + "\nI am " + me.age+" years old ." + "\nmy Appartment Rent is : " + me.myAppartmentRent + "\nMy annual income : " + me.mySalary + "\nMy Bank Balance is : " + me.myBankBalance + "\nMy height: " + me.myHight + "\nMy Grade is : " + me.myGrade + "\nMy Sex : " + me.mySex + "\nI am a Us Citizen : " + me.usCitizen );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
