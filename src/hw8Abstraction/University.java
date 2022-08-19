package hw8Abstraction;

public interface University {
	public void classSize();

	public abstract void playGround();

	public void teacher();

} // No we cannot create constructor inside a interface class.
//Constructor only work in public static, final variables, abstract class.