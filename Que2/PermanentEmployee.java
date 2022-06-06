package Que2;

public class PermanentEmployee extends Employee {

	double basicPay ;
	public PermanentEmployee(int id, String Name,double bpay) {
		super(id, Name);
		this.basicPay=bpay;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double PF  = this.basicPay*0.12;
		double sal = this.basicPay - PF;
		PermanentEmployee.super.salary=sal;
	}

}
