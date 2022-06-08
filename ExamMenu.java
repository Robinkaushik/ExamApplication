package ExamApplication;
import java.util.Scanner;
public class ExamMenu implements ExamResult{
	Scanner sc;
	String choice;
	 String mcq[][]=new String[3][8];
	static String result[][]=new String[3][3];
	ExamMenu(){
		sc=new Scanner(System.in);
		
				mcq[0][0]="Q.NO";
				mcq[0][1]="Question";
				mcq[0][2]="a1";
				mcq[0][3]="a2";
				mcq[0][4]="a3";
				mcq[0][5]="a4";
				mcq[0][6]="a5";
				mcq[0][7]="CorrectAns";
				mcq[1][0]="1";
				mcq[1][1]="What is the old name of Java";
				mcq[1][2]="Python";
				mcq[1][3]="C";
				mcq[1][4]="C++";
				mcq[1][5]="android";
				mcq[1][6]="oak";
				mcq[1][7]="Oak";
				mcq[2][0]="2";
				mcq[2][1]="What is the size of int in bytes";
				mcq[2][2]="4";
				mcq[2][3]="2";
				mcq[2][4]="1";
				mcq[2][5]="16";
				mcq[2][6]="8";
				mcq[2][7]="4";
				
				result[0][0]="Q.No";
				result[0][1]="UserAns";
				result[0][2]="Result";
				result[1][0]="1";
				result[2][0]="2";
				
				
				for(int r=0;r<mcq.length;r++) 
				{
					for(int c=0;c<mcq[r].length-1;c++) 
					{
						System.out.print(mcq[r][c]+"\t\t\t\t\t");
					}
					System.out.println();
				}
	}
	/*
	void AppendMenu() {
		for(int r=0;r<mcq.length;r++) {
			for(int c=0;c<mcq[r].length;c++) {
				System.out.println("Enter the Value at the position: "+r+c);
				mcq[r][c].append(sc.nextLine());
			}
		}
	}
	*/
	String menu() {
		String ch1;
		System.out.println("Do you want to enter Q & A(y/n)");
		ch1=sc.nextLine();
    while(ch1.equals("y")) {
		System.out.println("Enter question no.");
		String ch=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your answer");
		 choice=sc.nextLine();
    	if(ch.equals("1")) {
    		
			if(choice.equals("Python")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				  ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 //ch.append("2");
					 continue;
				 }
				 
				 
			}
			else if(choice.equals("C")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else if(choice.equals("C++")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else if(choice.equals("android")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else if(choice.equals("oak")) {
				ShowResult();
				System.out.println("Do you want to continue");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else {
				//System.out.println("Wrong Choice");
				System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				}
			//System.out.println("Do you want to attempt the question again");
			//ch=sc.next().charAt(0);
			
		}
		
		
    	if(ch.equals("2")) {
    		
			if(choice.equals("4")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				
				 
			}
			else if(choice.equals("2") ){
				 ShowResult();
				 System.out.println("Do you want to continue");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else if(choice.equals("1")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				  ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
				 
			}
			else if(choice.equals("16")) {
				 ShowResult();
				 System.out.println("Do you want to continue(y/n)");
				  ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			else if(choice.equals("8")) {
				ShowResult();
				System.out.println("Do you want to continue(y/n)");
				 ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			
			}
			else {
				//System.out.println("Wrong Choice");
				System.out.println("Do you want to continue(y/n)");
				  ch1=sc.nextLine();
				 if(ch1.equals("y"))
				 {
					 continue;
				 }
				 
			}
			//System.out.println("Do you want to attempt the question again");
			//ch=sc.next().charAt(0);
		
		}
		
    }
   return choice; 
}	
	
	@Override
	public void ShowResult() 
	{
		
		for(int r=1;r<mcq.length;r++) 
		{
			for(int c=0;c<mcq[r].length-1;c++)
			{
			  if(choice.equals("oak")) {
				if(mcq[1][6].equals("oak") )
				{	
				result[1][1]="oak";	
				result[1][2]="true";
				}
				else
				{
				result[1][1]="wrong option";		
				result[1][2]="false";
				}
			  }
			  if(choice.equals("4")) {
				if(mcq[2][2]=="4") 
				{
					result[2][1]="4";
					result[2][2]="true";
				}
				else
				{
				result[2][1]="wrong choice";	
				result[2][2]="false";
				}
			}
			 
		}
	}
		
	}	
	
	
	
	public static void main(String[] args) {
		ExamMenu em=new ExamMenu();
		em.menu();
		
		
		for(int r=0;r<result.length;r++) 
		{
			for(int c=0;c<result[r].length;c++) 
			{
				System.out.print(result[r][c]+"\t\t\t");
			}
			System.out.println();
		}
		
	}
}
