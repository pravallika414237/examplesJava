package empMain;

public class EmpSalary {

	private String employeeName;
	
	private double salary;

	@Override
	public String toString() {
		return "EmpSalary [employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	public EmpSalary(String employeeName, double salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
