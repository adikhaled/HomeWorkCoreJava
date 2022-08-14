package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) { // (main method)entry point of Java

		Computer computer = new Computer();
		Computer computer2 = new Computer("Apple", "Macbook Air", "Macos", 800, 'A', false);
		System.out.println(
				"\n-------------------------------------------------------------------------------------------------------------------");
		Computer computer3 = new Computer("Hp", "Dell", "Windwos 10", 700, 'A', true); // variable Initialize
	}

}
