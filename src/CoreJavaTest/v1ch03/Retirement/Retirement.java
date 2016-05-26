package CoreJavaTest.v1ch03.Retirement; /**
 *@date2016-2-25 19:18
 *@author mizeshuang
 */
import java.io.*;
import java.util.*;
public class Retirement{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);

		//read input
		System.out.print("How nuch money do you need to retire?");
		double goal=in.nextDouble();

		System.out.print("How much money will you contribute every year?");
		double payment=in.nextDouble();

		System.out.print("Interest rate in %:");
		double interestRate=in.nextDouble();

		double balance=0;
		int years=0;

		//update account balance while goal isn't reached
		while(balance<goal){

			//add this year's payyment and interest
			balance+=payment;
			double interest=balance*interestRate/100;
			balance+=interest;
			years++;
		}
		System.out.println("you can retire in "+years+" years.");
	}
}

