package employee;

import java.util.*;

class Employees {
	String employeeName;
	int employeeAge;
	String employeeEmail;
	long employeeContact;
	double employeeSalary;

	Employees(String name, int age, String email, long contact, double salary) {
		this.employeeName = name;
		this.employeeAge = age;
		this.employeeEmail = email;
		this.employeeContact = contact;
		this.employeeSalary = salary;

	}

	public void display() {
		System.out.println("EMPLOYEE NAME:" + employeeName.toUpperCase());
		System.out.println("EMPLOYEE AGE:" + employeeAge);
		System.out.println("EMPLOYEE EMAIL:" + employeeEmail.toLowerCase());
		System.out.println("EMPLOYEE CONTACT:" + employeeContact);
		System.out.println("EMPLOYEE SALARY:" + employeeSalary);
	}

	public void annualSalaryCalculator() {

		double annualSalary = employeeSalary * 12;
		System.out.println("anuual salary is: " + annualSalary);
	}

	public void bonusCalculator() {

		int age = this.employeeAge;
		if (age > 35 && age < 45) {

			double bonus = (12 * employeeSalary) * 1 / 4;

			System.out.println("bonus is: " + bonus);
		} else {
			double bonus = (12 * employeeSalary) * 1 / 10;
			System.out.println("bonus is: " + bonus);

		}

	}

	public void acceptEmployeeDetais() {

		Scanner s1 = new Scanner(System.in) ;
			System.out.println("Enter Name:");
			this.employeeName = s1.nextLine();
			
			System.out.println("Enter Age:");
			this.employeeAge=s1.nextInt();
			//this.employeeAge = Integer.parseInt(s1.nextLine()) ;
			//s1.nextLine();
			System.out.println("Enter Email:");
			employeeEmail = s1.nextLine();
			
			System.out.println("Enter Contact:");
			employeeContact = s1.nextLong();
			
			System.out.println("Enter Salary:");
			employeeSalary = s1.nextDouble();

		
	display();
		annualSalaryCalculator();
		bonusCalculator();
			//flag=false;

		}

	}


public class employeeMain {

	public static void main(String[] args) {

		Employees emp = new Employees("PRAVALLIKA", 26, "pravs.hyd@gmail.com", 8096414238l, 121001.124);
		/*
		 * emp. display(); emp.annualSalaryCalculator(); emp.bonusCalculator();
		 * emp.acceptEmployeeDetais();
		 */

		boolean flag = true;

		while (flag) {
			// Display Menu
			System.out.println("===========================");
			System.out.println("1. Input from user ");
			System.out.println("2. annual is: ");
			System.out.println("3. Bonus is: ");
			System.out.println("4. user details: ");
			System.out.println("5. Exit ");
			System.out.println("===========================");

			Scanner s = new Scanner(System.in);
			System.out.println("Please enter option: ");

			int inputFromUser = s.nextInt();

			switch (inputFromUser) {
			case 1:
				emp.acceptEmployeeDetais();
				break;
			case 2:
				emp.annualSalaryCalculator();
				break;
			case 3:
				emp.bonusCalculator();
				break;
			case 4:
				 emp. display();
				break;
			case 5:
				System.out.println("Terminated");
				break;
			default:
				System.out.println("Invalid input, valid inputs5 are [1,2,3,4,5]");
			}
		}

	}

}
