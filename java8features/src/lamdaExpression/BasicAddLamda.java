package lamdaExpression;

@FunctionalInterface
interface AddLamda {
	
	public int add(int a, int b);

}

 class hiAddLamda{
	
	public static void main(String [] args) {
	AddLamda al = (a,b)-> a+b;
	System.out.println(al.add(10,40));
	
	
	
	}
	
}

class BasicAddLamda extends hiAddLamda{
	
	//@Override  
	public static void main(String [] args) {
		
		System.out.println("helo");
	
	}
	
}


