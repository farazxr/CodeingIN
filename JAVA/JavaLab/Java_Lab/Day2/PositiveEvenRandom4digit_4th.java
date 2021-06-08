import java.util.Random;

public class PositiveEvenRandom4digit_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		System.out.println("The FIVE 4-digit Random Even numbers are:");
		int c=0;
		while(c<5)
		{
			int n=1000+rand.nextInt(9000);
			if(n%2==0) {
				System.out.println(n);
				c++;
				
			}
		}
	}

}
