import java.util.Scanner;

class Phone{
	Phone(){}
	String name,type;
	int price;
	public Phone(String pname, String ptype, int pprice) {
		
	name=new String(pname);
	type=ptype;
	price=pprice;
	}
	public void disp() {
		System.out.println("Name ="+ name);
		System.out.println("type ="+ type);
		System.out.println("Price= Rs."+ price);
	}
	public void makeCall() {
		System.out.println("Phone will make a Call! TRING! TRING!");
	}
	public void receiveCall() {
		System.out.println("TRING! TRING! Phone can receive Calls");
	}
}


class Mobile extends Phone{
	String mntwrkType,mntwrk;
	public Mobile(String name, String type, int price, String ntwrktype,String ntwrk) {
		
		super(name,type,price);
		 mntwrkType =ntwrktype;
		 mntwrk =ntwrk;
		
		}
	public void disp() {
		System.out.println("Name ="+ name);
		System.out.println("type ="+ type);
		System.out.println("Price= Rs."+ price);
		System.out.println("Networktype ="+ mntwrkType);
		System.out.println("Network ="+ mntwrk);
	}
	
	public void sendSms() {
		System.out.println("These Mobiles can send SMS");
	}
	public void receiveSms() {
		System.out.println("These Mobiles can receive SMS");
	}
	public void isSmartPhone() {
		System.out.println("This is a modern Smart phone!");
	}
}
class Landline extends Phone{
	String lntwrkCable,lareacode;
public Landline(String name, String type, int price, String ntwrkCable,String areacode) {
		
		super(name,type,price);
		lntwrkCable =ntwrkCable;
		lareacode =areacode;
		
		}
public void disp() {
	System.out.println("Name ="+ name);
	System.out.println("type ="+ type);
	System.out.println("Price= Rs."+ price);
	System.out.println("NetworkCabel ="+ lntwrkCable);
	System.out.println("AreaCode ="+ lareacode);
}

	public void getBroadband() {
		System.out.println("Will also provide us Broadband connection with Landline!");
	}
}
public class PhoneProblem5 {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone name,type and price:");
		String pname=sc.nextLine();
		String ptype=sc.nextLine();
		int pprice=sc.nextInt();sc.nextLine();

		Phone nokia=new Phone(pname,ptype,pprice);
		nokia.disp();
		System.out.println("Basic Phone features: ");
		nokia.makeCall();nokia.receiveCall();
		System.out.println();System.out.println();
		
		System.out.println("Enter MOBILE name,type, price,networkType and network:");
		String mname=sc.nextLine();
		String mtype=sc.nextLine();
		int mprice=sc.nextInt();sc.nextLine();
		String mnetwrkType=sc.nextLine();
		String mntwrk=sc.nextLine();
		
		Mobile mob = new Mobile(mname, mtype, mprice, mnetwrkType,mntwrk );
		mob.disp();
		System.out.println("Next gen Mobile features: ");

		mob.makeCall();mob.receiveCall();
		mob.sendSms(); mob.receiveSms();
		mob.isSmartPhone();
		System.out.println();System.out.println();
		
		System.out.println("Enter LANDLINE name,type, price,networkCable and areacode:");
		String lname=sc.nextLine();
		String ltype=sc.nextLine();
		int lprice=sc.nextInt();sc.nextLine();
		String lnetwrkcable=sc.nextLine();
		String lareacode=sc.nextLine();
	
		Landline land=new Landline(lname,ltype,lprice, lnetwrkcable,lareacode);
		land.disp();
		System.out.println("For Home and Office Call and Netwrk Services:");
		land.makeCall();land.receiveCall();
		
		land.getBroadband();
		
		
	}

}
