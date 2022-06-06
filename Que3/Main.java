package Que3;

import java.util.Scanner;

public class Main {

	public void showDetails(Month m){
		switch(m) {
		case JAN :
			m.month();
			break;
		case FEB :
			m.month();
			break;
		case APR :
			m.month();
			break;
		case MAY :
			m.month();
			break;
		case JUN :
			m.month();
			break;
		case JUL :
			m.month();
			break;
		case AUG :
			m.month();
			break;
		case SEP :
			m.month();
			break;
		case OCT :
			m.month();
			break;
		case NOV :
			m.month();
			break;
		case DEC :
			m.month();
			break;
		}
		
			
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Month Name ex.JAN, FEB, JUN, JUL..etc");
		String m =sc.next();		
		try {
		Month mo = Month.valueOf(m);
		
		Main main = new Main();
		System.out.println("=============================");
		main.showDetails(mo);
		System.out.println("=============================");
		}catch (IllegalArgumentException iae) {
			System.out.println("========================");
			System.out.println("Invalid Month Name .");
			System.out.println("========================");
		}
	}
		
}
