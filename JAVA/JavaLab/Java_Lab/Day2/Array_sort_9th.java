import java.util.Scanner;
import java.util.Arrays;

public class Array_sort_9th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//IMP: pre-take of size and then declare array variable!
		int[] arr=new int[n];
		
		
		for (int i = 0; i <n ; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("\n\nAfter sorting arr2: ");
		for (int z : arr) {
			System.out.println(z);
		}
		System.out.println("\n2nd Largest number in an array ="+arr[n-2]);
		System.out.println("3rd Largest number in an array ="+arr[n-3]);
		
		System.out.println("2nd Smallest number in an array ="+arr[1]);
		System.out.println("3rd Smallest number in an array ="+arr[2]);
		
		
		
		
	}

}
