package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // constructor initialized
		aboutMe.name = "Khaled"; //variable initialize 
		aboutMe.age = 127;
		aboutMe.myHeight = 5.6f;
		aboutMe.sex = 'M';
		aboutMe.myAppartmentRent = 2400;
		aboutMe.myAnnualIncome = 525856545;
		aboutMe.myBankBalance = 564489648946l;
		aboutMe.myGrade = 4.29;
		aboutMe.usCitizen = true;
		aboutMe.aboutMe(); // method initialize
		
		
		System.out.println("\n-------------------------------------------------\n");
		AboutMe aboutMe2 = new AboutMe();
		aboutMe2.name = "Alex"; // variable initialize
		aboutMe2.age = 115;
		aboutMe2.myAppartmentRent = 2100;
		aboutMe2.myAnnualIncome = 500000;
		aboutMe2.myBankBalance = 5654498494l;
		aboutMe2.myHeight = 5.4f;
		aboutMe2.myGrade = 4.23;
		aboutMe2.sex = 'M';
		aboutMe2.usCitizen = false;
		aboutMe2.aboutMe(); // method initialize
		
		
		
		
		
		
		
		
		
		
		

	}

}
