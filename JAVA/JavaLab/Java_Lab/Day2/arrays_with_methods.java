import java.util.Arrays;

public class arrays_with_methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {100,-20,30,14,67},arr2= {1,-2,300,43};
		System.out.println("Elements in array arr1 are:");
		for (int j : arr1) {
			System.out.println(j);
		}
		System.out.println("Elements in array arr2 are:");
		for (int k : arr2) {
			System.out.println(k);
		}
		   int src[],srcPos,dest[],destPos,length;  
	        src=arr1;  
	        srcPos=1;  
	        dest=arr2;  
	        destPos=1;  
	        length=2;  
	        System.arraycopy(src, srcPos, dest, destPos, length); //use of arraycopy() method  
	        System.out.println("Destination array after use of arraycopy()");  
	        for(int k=0;k<arr2.length;k++)  
	        {  
	            System.out.print(arr2[k]+"\t");  
	        }  
		Arrays.sort(arr2);		//using Arrays.sort method
		System.out.println("\n\nAfter sorting arr2: ");
		for (int z : arr2) {
			System.out.println(z);
		}
		
		Arrays.parallelSort(arr1);		//using Arrays.sort method
		System.out.println("\n\nAfter sorting arr1: ");
		for (int z : arr1) {
			System.out.println(z);
		}
		System.out.println("\nElement 67 in arr1 is at position:-");
	System.out.println(Arrays.binarySearch(arr1, 67));		//using Arrays.binarySearch method
	
	if(Arrays.equals(arr1, arr2)) {						//using Arrays.quals() method to compare 2 arrays
		System.out.println("\nArray arr1 and arr2 are same and equal");
	}else {
		System.out.println("\nArray arr1 and arr2 are not equal!!");
	}
	
	
		
		
	}

}
