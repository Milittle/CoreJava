package CoreJavaTest.v1ch03.InputTest; /**
 *@date:2016-2-25 18:32
 *@author mizeshuang
*/
import java.util.*;
 public class InputTest{
 	public static void main(String []args){
 		Scanner in=new Scanner(System.in);

 		//get first input
 		System.out.println("what's your name:");
 		String name= in.nextLine();

 		//get second input
 		System.out.println("How old are you:");
 		int age=in.nextInt();
 		System.out.println("hello! "+name+"Next year! you will be "+(age+1));
 	}
 }