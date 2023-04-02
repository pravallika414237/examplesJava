package loopsExample;

import java.util.Scanner;

public class WhileBankExample {
   //access specifiers=public,private,protected
	//static
	//return type
	//function name
	
	//namingconvention 
	public static void checkBalance() {
		System.out.println("your balance is :");
		
	}
	public static void deposit() {
		System.out.println("your deposit is :");
		
	}

	public static void withDrawl() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter your withdrawl amount :");
		int  bal= s.nextInt();
		s.nextLine();
		System.out.println("your transaction is being proceed....");
		System.out.println("collect your amount.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  //int balance =5000;
  System.out.println(" 1.check balance \n 2.deposit \n 3.withdrawl");
  Scanner s= new Scanner(System.in);
  
  int i=1;
 do { 
	 System.out.println("Enter 1 or 2 or 3 or 4");
	  int num=s.nextInt();
	  s.nextLine();
  switch(num)
  {
        case 1:
               {
	            checkBalance();
	            break;
               }
        case 2:
        {
        	deposit();
        	break;
        }
        case 3:
        {
        	  withDrawl();
        	  break;
        }
        case 4:
        {
        	System.exit(0);
        }
        default:
        {
        	System.out.println("wrong entry.");
        }}
  
  }while(i==1);      	
  }
	}


