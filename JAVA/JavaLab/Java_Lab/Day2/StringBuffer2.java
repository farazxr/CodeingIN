
public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Java");  
		   System.out.println("StringBuffer method-1 append");
		sb.append(" Islands/Language");//1.now original string is changed using .append() method
		System.out.println(sb);//prints Hello Java  
		
		System.out.println("\nStringBuffer method-2 insert");
		StringBuffer st=new StringBuffer("Hellosir ");  
		st.insert(1,"Java");//now original string is changed starting from index pstn-1  
		System.out.println(st);//prints HJavaellosir  
		
		System.out.println("\nStringBuffer method-3 replace");
		StringBuffer str=new StringBuffer("Hellomadam");  
		str.replace(1,3,"Java");  //start to end index to overwrite range!
		System.out.println(str);//prints HJavalomadam 
		
		System.out.println("\nStringBuffer method-4 delete");
		StringBuffer strn=new StringBuffer("HelloFaraz");  
		strn.delete(1,3);  
		System.out.println(strn);//prints HloFaraz
		
		System.out.println("\nStringBuffer method-5 reverse");
		
		StringBuffer t=new StringBuffer("Faraz");  
		t.reverse();  
		System.out.println(t);//prints zaraF 
		
		
		
	}

}
