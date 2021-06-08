
public class String_with_methods1 {

    public static void main(String[] args) { 
        String company_name="Tesla Inc.";		//declaring a string METHOD-1
        String new_model_name= new String("Cybertruck"); //declaring a string METHOD-2
        System.out.println("String method-1");
        System.out.println("Size of the string(company name) is = "+company_name.length()); //1.method to find string_size
        System.out.println(new_model_name);
        
        System.out.println("String method-2");
        System.out.println("The 3rd alphabet in Company's name is: "+company_name.charAt(2));//2.method to find char at an index 
        
        System.out.println("String method-3");
        System.out.println("Alphabet T in your company's name is at which position ? \n "+company_name.indexOf('T')+"th Position!"); //3.method to find index of a character
        
        System.out.println("String method-4");
        String str="           Hello this is not a hello mail not!			";
        System.out.println("At what index did t occur lastly in the string ? \n "+str.lastIndexOf("t")+"");//4method to know last occurrence of that character in the string
       
        System.out.println("String method-5");
        System.out.println("Lower-case form:"+company_name.toLowerCase());//5.method toh convert to LOWER case
        System.out.println("String method-6");
        System.out.println("UPPERCASE  form:"+company_name.toUpperCase());//6.method to convert to UPPER case
        
        System.out.println("String method-7");
        int numbr=101;
        String s1=(String.valueOf(numbr));//7.converts integer/float/boolean/char to string type!
        
        System.out.println("String method-8");
        System.out.println(s1+"xd");
        System.out.println("Before trimming:"+str);
        System.out.println("After trimming:"+str.trim() +"         <<< Here you can see extra space gone coz. of .trim()");	//8.trim off extra spaces!
        
        System.out.println("String method-9");
        System.out.println(s1.concat("  Science!"));//9.appends a string with given parmtr string.
       
        System.out.println("String method-10");
        String date = String.join("/","25","06","2018");   //10.method returns a string joined with given delimiter.
        
        System.out.println("String method-11");
        System.out.print(date);     
        System.out.println(" \n '/' is the delimiter which seperates the elements i.e 25,06,2018");
        System.out.println("After splitting date giving regex string i.e '/' here! we split the string as array of strings!! ");
        
        String[] arrayOfstr=date.split("/");//11.splits given string into array of strings based on given regex string!
        for (String a : arrayOfstr)
            System.out.println(a);
        
        System.out.println("String method-12");
        String s2="I am learning JAVA!";
        String replaceString=s2.replace("am", "was");//12. to replace a word or char in a string.
        System.out.println(" \n .replace() method converts \n"+s2 +"\nto:");
        System.out.println(replaceString);
        
        System.out.println("String method-13");
        String z1="java";  
        String z2="java";  
        String z3="JAVA";  	//13..equals() compares strings including casing(upper/lower)!
        String z4="avaj";  
        System.out.println("\n "+z1.equals(z2));//true because content and case is same  
        System.out.println(z1.equals(z3));//false because case is not same  
        System.out.println(z1.equals(z4));//false because content is not same  
        
        System.out.println("String method-14");
        System.out.println("\n "+z1.equalsIgnoreCase(z2));//true because content and case is same  //14.in .equalsIgnoreCase casing doesnt matter!!
        System.out.println(z1.equalsIgnoreCase(z3));//true although case is not same  
        System.out.println(z1.equalsIgnoreCase(z4));//false because content is not same  
        
        
        System.out.println("String method-15");
        String movie="Avengers Endgame 2019";  
        System.out.println( "\n"+movie.contains("Iron"));//15. .contains() method searches sequence of characters in this string & returns true/false if found or notfound!
        System.out.println(movie.contains("2019"));  
        System.out.println(movie.contains(" "));  //single space is also there  in the movie name
        
        
    }
}