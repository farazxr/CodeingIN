import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[][]=new int[3][3];
          int b[][]=new int[3][3];
          int sum[][]=new int[3][3];
          
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Matrix A's elements");
          for(int i=0;i<3;i++) {
        	  for (int j=0;j<3;j++) {
        		  a[i][j]=sc.nextInt();
 
        	  }
        	  System.out.println("\n");
          }
          System.out.println("Enter Matrix B's elements");
          for(int i=0;i<3;i++) {
        	  for (int j=0;j<3;j++) {
        		  b[i][j]=sc.nextInt();
        	  }
        	  System.out.println("\n");
          }
          System.out.println("Sum of matrices A and B is:");
          for(int i=0;i<3;i++) {
        	  for (int j=0;j<3;j++) {
        		  sum[i][j]= a[i][j]+ b[i][j];
        		  System.out.print(sum[i][j]+" ");
        	  }
        	  System.out.println("\n");
          }
	}

}
