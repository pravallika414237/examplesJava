package empMain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmpSalary employeeObject1 = new EmpSalary ("pravallika" , 40000);
		EmpSalary employeeObject2 = new EmpSalary ("Ravi" , 65000);
		EmpSalary employeeObject3 = new EmpSalary ("Asif" , 70000);
		
		
		List <EmpSalary> listEmployee = new ArrayList<EmpSalary>();
		listEmployee.add(employeeObject1);
		listEmployee.add(employeeObject2);
		listEmployee.add(employeeObject3);
		
		for(EmpSalary emp: listEmployee) {
			if(emp.getSalary() >=60000.00) {
				System.out.println(emp.toString());
				
			}
		}
		
		

	}

}
