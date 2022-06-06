package Que2;

public abstract class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	
	public Employee(int id, String Name) {
		this.employeeId = id;
		this.employeeName = Name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	 public abstract void calculateSalary();

}
