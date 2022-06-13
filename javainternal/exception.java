import java.util.Scanner;
class markExec extends Exception{
	markExec(String msg){
		super(msg);
	}
}
public class ex {
	  class 

	public static void main(String[] args) {
		  int mark;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mark of student");
		int mark=s.nextInt();
		s.nextLine();
     try{	
			if(mark<40){
					throw new markExec("the student is failed");
			}
			else if(mark>40{
				throw new markExec("the student is passed");
			}
		
			
				
			}catch(markExec e){
				System.out.println(e.getMessage());
		}
		
	
	}

}
