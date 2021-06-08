
public class Ten_args {
	public static void main(String args[]) {
		int sum=0; float avg;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		avg=sum/(args.length);
		System.out.println("Sum of arguments ="+ sum);
		System.out.println("Average of arguments ="+ avg);
	}

}
