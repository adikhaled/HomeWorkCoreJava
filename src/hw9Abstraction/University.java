package hw9Abstraction;

// 
public interface University extends College, Hospital {
	public void classSize();

	public abstract void playGround();

	public void teacher();

	default void gymnasium() {

	}

	public static void library() {

	}

} // No we cannot create constructor inside a interface class.
//Constructor only work in public static, final variables, abstract class.