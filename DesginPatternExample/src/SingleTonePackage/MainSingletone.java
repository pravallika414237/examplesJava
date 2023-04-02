package SingleTonePackage;

public class MainSingletone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//invalid for single tone as we cant create multiple objects
		//SingletoneExample sc= new SingletoneExample();
		//calling an accessible constructor
		
		//constructor as private
		//obj as private static
		//write methodwhich returns object
		//how to access??
		
		SingletoneExample sc=	SingletoneExample.getInstance();
//static method can be accessed with class name	
		sc.showMessage();
		SingletoneExample sc2=	SingletoneExample.getInstance();
		sc2.showMessage();
	}

}