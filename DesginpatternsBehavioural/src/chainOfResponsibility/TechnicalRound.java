package chainOfResponsibility;

import java.util.Scanner;

public class TechnicalRound extends InterviewHandler{
 
	candidate1 c1=new candidate1();
	Scanner sc= new Scanner(System.in);
	
	@Override
	public String interviewProcess() {
		System.out.println("_______________welcome to technical round_____________");
		System.out.println("enter candidate name :");
		this.c1.setName(sc.nextLine());
		System.out.println("enter candidate score :");
		this.c1.setScore(sc.nextDouble());
		if(c1.getScore()>=80)
		{
			return interviwer.interviewProcess();
		}
		else {
			return "candidate rejected due to low technical marks. scored : "+ c1.getScore();
		}
		
	}

}
