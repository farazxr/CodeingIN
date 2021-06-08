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
 class Ironman_with_Infinity_gauntlet extends Ironman{	
	 public void powers() {
			super.powers();
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" v ");
			System.out.println("Ironman after getting Infinity gauntet, now has extended powers & can control Power,Time,Energy,Souls,Space & can SNAP to bring the lost ones! ");
		} 
 }



public class Multilevel_inheritance4b {
	public static void main(String...args) {
		Ironman_with_Infinity_gauntlet tony= new Ironman_with_Infinity_gauntlet();
		tony.powers();
	
	}

}
