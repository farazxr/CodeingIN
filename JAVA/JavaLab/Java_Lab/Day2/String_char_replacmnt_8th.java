import java.util.Scanner;
public class String_char_replacmnt_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a string");
		 StringBuilder str =new StringBuilder(sc.nextLine());
		 System.out.println("enter a character");
		char ch = sc.next().charAt(0); //gives single digit at 0th index as character!
		int len=str.length();
			System.out.println("Inserting char at beginning,middle,last index of the string! we use setCharAt() method");
			str.setCharAt(0, ch);
		str.setCharAt(len/2, ch);
			str.setCharAt(len-1, ch);
			str.toString();
			System.out.println(str);
			
	}

}
