import java.util.Scanner;
public class Find_small_biggest_char1st {
	static char smallest_char(String name ) {
		int len=name.length();
		char min='z';
		for(int i=0;i<len;i++) {
			if(name.charAt(i)<min) {
				min=name.charAt(i);
			}
		}
		return min;
	}
	static char largest_char(String name ) {
		int len=name.length();
		char max='A';
		for(int i=0;i<len;i++) {
			if(name.charAt(i)>max) {
				max=name.charAt(i);
			}
		}
		return max;
	}
	
	static public void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String name =sc.nextLine();
		System.out.println("Smallest character in "+name+" is ="+ smallest_char(name));
		System.out.println("Largest character in "+name+" is ="+ largest_char(name));
	}

}
