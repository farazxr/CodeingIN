
public class MathClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=5;
		   System.out.println("Square root of "+a+" is ="+Math.sqrt(a));
		   System.out.println("Cube root of "+b+" is ="+Math.cbrt(b));
		   System.out.println(a+"^"+b+"="+Math.pow(a,b));
		   double d=6.34;
		   System.out.println("\nCeiling/Nearest higher value of "+d+" is ="+Math.ceil(d));
		   System.out.println("Floor/Nearest lower value of "+d+" is ="+Math.floor(d));
		   System.out.println("Nearest rounded value of "+d+" is ="+Math.round(d));
		   								//Math.PI=3.141 is a symbolic constant property!
		   int angle=90;
		   double radian=Math.toRadians(angle);	//method to convert to radians!
		   System.out.println("\nSine value of "+ (radian)+" is ="+Math.sin(radian));
		   System.out.println("Cosine value of "+ (radian)+" is ="+Math.cos(radian));
		   System.out.println("Tan value of "+ (radian/2)+" is ="+Math.tan(radian/2)); //for tan(radian) i.e tan 90 we wont get infinte similarly for cos90 we get 6.1213232-17 i.e 6e-17 viz a small numbr smaller than zero!
		   																				//above issues are round off errors!
		   System.out.println(" \nRandom numbr b/w 0 to 1 return a random double type numbr. ");
		   System.out.println(Math.random());
		   System.out.println("floorDiv method");
		   int x = 25;  
	        int y= 3;  
	        // 25/3 value is 8.33 so floor(8.33) = 8   
	        System.out.println(Math.floorDiv(x, y));  
	        System.out.println("floorMod method"); 
	       int  ap=123,bp=50;		//same sign then normal as %
	       System.out.println(Math.floorMod(ap,bp));  
	       int  cp=-123,dp=50;			//different sign then res= divisor=remainder
	       System.out.println(Math.floorMod(cp,dp));  
	       int  ep=123,fp=-50;
	       System.out.println(Math.floorMod(ep,fp));  
	       System.out.println("\n Max of l,m");
	       System.out.println("Given l=100,m=334");
	       int l=100,m=334;
	       System.out.println("maximum of l,m is="+Math.max(l,m)); 
	       System.out.println("minimum of l,m is="+Math.min(l,m)); 
	       System.out.println("Value of PI=  "+-Math.PI);
	       
	       System.out.println("Absolute value of PI is= "+Math.abs(-Math.PI)); 
	     
	       
	
	
	
	
	}

}