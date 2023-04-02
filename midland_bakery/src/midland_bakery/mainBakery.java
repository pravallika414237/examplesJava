package midland_bakery;

import java.io.IOException;
import java.util.*;

public class mainBakery {
	public static void main(String [] args) throws IOException {
		
		Midland_menu fo=new Midland_menu(); 
		do { 
	
		fo.displayMenue();
		fo.order();
		}while(true);
	}

}