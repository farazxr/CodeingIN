import java.util.Scanner;

public class Palindrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		StringBuffer st=new StringBuffer(sc.nextLine());
		StringBuffer compare_string= new StringBuffer(st.reverse());
		st.reverse(); 
		if((compare_string.toString()).equals(st.toString())) {
			    System.out.println("It's a palindrome!!");
				}
				else {
					System.out.println("It's not a palindrome!!");
				}
	}

}
