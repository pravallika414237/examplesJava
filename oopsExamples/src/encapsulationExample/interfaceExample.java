package encapsulationExample;
interface abc11{
	void sum2();
	void display();
	
}
interface wef{
	void has();
	
}
class ghi implements abc11,wef{
//
	@Override
	public void sum2() {
	System.out.println("sum method implementation called -- ");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method implementation called -- ");
	}

	@Override
	public void has() {
		// TODO Auto-generated method stub
		
	}
	
}

public class interfaceExample {

	public static void main(String[] args) {
		ghi g = new ghi();
		g.display();
		g.sum2();
			
	}

}
