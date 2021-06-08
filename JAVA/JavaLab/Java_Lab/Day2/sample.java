import java.util.*;

public class sample {


		public static void main(String[] args)
		{
			int a[]={1,2,3,4,5};
			int b[]={10,20,30,40,50};
			int c[]={23,56,89,37,12};
			//1.length()
			System.out.println("\nLength of array-a = "+a.length);
			
			//2.System.arraycopy()
			System.arraycopy(a,1,b,1,1);
			System.out.println("\nAfter copying from a to b : ");
			for(int i:b) {
				System.out.println(i+" ");
			}
			//3.Arrays.sort()		
			System.out.print("\nBefore sorting c-array : ");
			for(int i:c) {
				System.out.println(i+" ");
			}
			Arrays.sort(c);
			System.out.print("Before sorting c-array : ");
			for(int i:c) {
				System.out.println(i+" ");
			}
			//4.Arrays.binarySearch()		
			System.out.println("\nEnter search key : ");
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			int pos=Arrays.binarySearch(c,key);		
			System.out.println("Element-"+key+" is found at index = "+pos);
			
			//5.Arrays.equals()		
			System.out.println("Arrays a & b are equal ? "+Arrays.equals(a,b));
			
			//6.Arrays.fill()
			Arrays.fill(a,1,4,25);	
			System.out.println("Array-a after filling with 25 :");
			for(int i:a){
				System.out.println (i+" ");
			}
			}
		}
	


