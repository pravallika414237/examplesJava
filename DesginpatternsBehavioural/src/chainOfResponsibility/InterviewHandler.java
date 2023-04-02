package chainOfResponsibility;

public abstract class InterviewHandler {
	protected  InterviewHandler interviwer;



	public void setInterviwer(InterviewHandler interviwer) {
		this.interviwer = interviwer;
	}
	
	public abstract String interviewProcess();

}
