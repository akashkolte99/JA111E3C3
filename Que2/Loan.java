package Que2;

public class Loan {

	private Loan() {
		// TODO Auto-generated constructor stub
	}
	
	public Loan getloan() {
		return Loan;
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			double lo = employeeObj.salary *0.15;
			double loan =lo;
			return loan;
		}else {
			double lo= employeeObj.salary * 0.10;
			double laon=lo;
			return laon;
		}
	}
}
