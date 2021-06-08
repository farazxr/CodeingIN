

/*our Hybrid Inheritance model is like
 
Student_data
 	|
 	|
   \ /
   	v
 Exam_marks		  Project
 	|				  |
 	|				  |
   \ /				  |
   	v				  /
  Result <<<_________/ 	

*/
class Student{	
	static int roll=141;
	static int practical_marks=30;
	
}
class Exam extends Student{
	static int theory=70;
	static int exam_marks=theory+practical_marks;	//make it static as final_marks are static
}

interface Project{		//INTERFACE
	static int proj_marks=100;		//public static final
	 void disp();
}
 class Result extends Exam implements Project{	//it extends Exam and implements Project
	 int final_marks=exam_marks+ proj_marks;
	public void disp() {						//Defining Interface abstract method;
		   System.out.println("Roll = "+roll);
		   System.out.println("theory = "+ theory);
		   System.out.println("Practical = "+practical_marks);
		   System.out.println("Exam Marks = "+exam_marks);
		   System.out.println("Project Marks = "+proj_marks);
		   System.out.println("Total = "+ final_marks);
	   }
 }
 class  Hybrid_inheritance4d{
	 public static void main(String...args) {
		 Result obj= new Result();
		 obj.disp();
	 }	
}
