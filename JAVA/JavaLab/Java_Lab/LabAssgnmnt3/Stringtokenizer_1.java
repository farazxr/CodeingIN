import java.util.*;  
  
public class Main {  
   public static void main(String[] args) {  
       StringTokenizer st = new StringTokenizer("1 2 3 4 5"," ");  
         System.out.println("No of elemnts="+st.countTokens());
      // printing next token  
      int []ar=new int[10]; int sum=0;
      int len=st.countTokens(); //dont keep directly in for loop as it's value is dynamic!!
      for(int i=0;i<len;i++){
          ar[i]=Integer.parseInt(st.nextToken());
          System.out.println("array ele="+ar[i]);
       
      }
       System.out.print("Odd no.s are:");
       for(int i=0;i<len;i++){
        if(ar[i]%2!=0)
        System.out.print(ar[i]+" ");
       }
        System.out.println("");
         System.out.print("Even no.s are:");
       for(int i=0;i<len;i++){
        if(ar[i]%2==0)
        System.out.print(ar[i]+" ");
       }
   }      
}  