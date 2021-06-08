class Man {
	 public void powers() {
		 System.out.println("Man is normal with no Superpowers but with decent intelligence");
	 }
}
class Ironman extends Man {
	public void powers() {
		super.powers();
		System.out.println(" | ");
		System.out.println(" | ");
		System.out.println(" v ");
		System.out.println("After getting Ironman Suit he'll have extended powers like: flying,shooting,flight_thrusters etc.. ");
	}
}


public class SingleInheritance4a {
	public static void main(String...args) {
		Ironman tony =new Ironman();
		tony.powers();
	}
}
