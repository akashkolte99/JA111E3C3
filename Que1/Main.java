package Que1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array ");
		try {
		int size = sc.nextInt();
		
		int arr[] =new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element in the array "+i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int ind = sc.nextInt();
		
		System.out.println("=============================================");
		System.out.println("The array element at index "+ind+" is "+arr[ind]);
		System.out.println( "The array element successfully accessed");
		}catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("Please Enter Valid Index");
		}catch(IndexOutOfBoundsException ibe) {
			System.out.println(ibe.getMessage());
			System.out.println("Please Enter Valid Index");

		}catch(InputMismatchException ipe) {
			
			System.out.println("Please Enter Valid Number");

		}
		
	}
	
}



