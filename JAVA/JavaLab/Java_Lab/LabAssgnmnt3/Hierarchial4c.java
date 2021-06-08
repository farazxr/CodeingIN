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
class Spiderman extends Man{
	public void powers() {
		super.powers();
		System.out.println(" | ");
		System.out.println(" | ");
		System.out.println(" v ");
		System.out.println("After getting bit by a special Spider:he'll have extended powers like:Websling generation, flexible strong body, high reflexes,can climb surfaces etc.. ");
		
		
	}
}
public class Hierarchial4c {
	public static void main(String...args) {
		Ironman tony= new Ironman();
		Spiderman  peter = new Spiderman();
		tony.powers();
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		peter.powers();
	}
	}

