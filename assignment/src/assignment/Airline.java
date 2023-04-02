package assignment;
class AirlineDetails{
	 String dcity;
		String acity;
		long flightNo;
		String seatNo;
		AirlineDetails(String dcity,String acity,long flightNo,String seatNo){
			this.dcity=dcity;
			this.acity=acity;
			this.flightNo=flightNo;
			this.seatNo=seatNo;
			}
		public void display() {
			System.out.println("PASSENGER DETAILS : ");
			System.out.println("DEPATURE CITY IS :"+ dcity );
			System.out.println("ARRIVAL CITY IS :"+ acity );
			System.out.println("FLIGHT NUMBER IS :"+ flightNo);
			System.out.println("SEAT NUMBER IS :"+ seatNo);
		}

}

public class Airline {
 
	public static void main(String[] args) {
		AirlineDetails passenger1= new AirlineDetails("MUM", "HYD", 809641, "C41");
		passenger1.display();
		AirlineDetails passenger2= new AirlineDetails("VISAKHAPATNAM", "DELHI", 423791, "C42");
		passenger2.display();
		
		

	}

}
