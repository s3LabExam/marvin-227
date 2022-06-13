package marvin;
import java.util.Scanner;


 public class student {
	 int studid;
	 String sname;
	 String branch;
	 
	 void input(){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter tthe student id  ");
			studid=s.nextInt();
			s.nextLine();
			System.out.println("Enter student name ");
			sname=s.nextLine();
			System.out.println("enther student branch ");
			s.nextLine();
			branch=s.nextLine();
		}
	 void dispaly()
	 {
		 System.out.println(studid);
			System.out.println(sname);
			System.out.println(branch);
		}
		 
	 }
 public static void main(String[] args){
		studid obj1=new studid();
		obj1.input();
		sname obj2=new sname();
		obj2.input();
		branch obj3=new branch();
		obj3.input();
		System.out.println("student id");
		obj1.display();
		System.out.println("student name");
		obj2.display();
		System.out.println("branch");
		obj3.display();
	 
	

}
 
 }

