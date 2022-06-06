package Que4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public Customer detailsValidation(String name,String pass,String mob,String mail) {

		if(Pattern.matches("[a-zA-Z]{3,8}", name)&&Pattern.matches("[a-zA-Z0-9]{3,8}", pass)&&Pattern.matches("[6789]{1}[0-9]{9}", mob)&&Pattern.matches("[a-zA-Z0-9_\\.\\-]+[@][a-z]+[\\.][a-z]{2,3}", mail))
		
		return new Customer(name,pass,mob,mail);
		else
			return null;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name =sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		System.out.println("Enter MobileNumber");
		String mob = sc.next();
		System.out.println("Enter Email");
		String mail = sc.next();
		
		Demo d = new Demo();
		Customer c = d.detailsValidation(name,pass,mob,mail);
		System.out.println("==================================");
		if(c instanceof Customer) {
			System.out.println("Name is :" +c.getUsername());
			System.out.println("Name is :" +c.getPassword());
			System.out.println("Name is :" +c.getMobileNumber());
			System.out.println("Name is :" +c.getEmail());
		}
		else {
			System.out.println("Please Enter All Details Correctly ");
		}
		System.out.println("==================================");
	}
}


//
//
//Take the input from the user and create an object of the Customer with all the details.
//Make sure that to perform the following input validations:
//username: should contain only alphabets and length should be min 3 and max 8
//characters.
//password: should be alpha-numeric and also min 3 and max 8 characters.
//mobileNumber: should be an Indian mobile number starting with 6,7,8,9 and the
//length should be 10.
//email: a valid email address.
//
//If all input fields are valid then only create an object of Customer and print all the details from the
//Customer object.
//otherwise, print the appropriate validation error message.