package Que2;

public class TemporaryEmployee extends Employee {

   int 	hoursWorked;
	int hourlyWages;
	public TemporaryEmployee(int id, String Name,int hworked,int hwage) {
		super(id, Name);
		this.hourlyWages=hwage;
		this.hoursWorked=hworked;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double sal = this.hourlyWages*this.hoursWorked;
		TemporaryEmployee.super.salary=sal;
	}

}
