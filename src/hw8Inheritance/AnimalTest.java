package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();// single inheritance
		animal.animalInfo();

		System.out.println("\n-----------------\n");
		BullDog bullDog = new BullDog();// Multilevel inheritance
		bullDog.bullDogInfo();
		bullDog.animalInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();

		System.out.println("\n------------------\n");
		Mammal mammal = new Mammal(); // Hierarchical inheritance
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n------------------\n");
		Cobra cobra = new Cobra();// Multilevel inheritance
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n-------------------\n");
		Snake snake = new Snake();// Multilevel inheritance
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n--------------------\n");
		Reptile reptile = new Reptile();// Hierarchical inheritance
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n---------------------\n");
		Robin robin = new Robin();// Multilevel inheritance
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n----------------------\n");
		Birds birds = new Birds();// Hierarchical inheritance
		birds.birdsInfo();
		birds.animalInfo();

	}

}
