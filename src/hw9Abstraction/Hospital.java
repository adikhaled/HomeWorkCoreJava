package hw9Abstraction;

public interface Hospital {
	public void emergencyRoomn();

	public abstract void surgeryRoom();

	public void cafeteria();

	default void morgue() {

	}

	public static void pharmacy() {

	}

}
