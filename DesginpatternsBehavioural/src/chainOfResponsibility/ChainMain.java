package chainOfResponsibility;

public class ChainMain {

	public static void main(String[] args) {
		TechnicalRound t= new TechnicalRound();
		ManagerRound  m= new ManagerRound();
		 HRround h= new  HRround();
		 
		 t.setInterviwer(m);
		 m.setInterviwer(h);
    System.out.println(t.interviewProcess());		
	}

}
