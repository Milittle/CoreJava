package CoreJavaTest.v1ch02.Welcome;

/**
 *@date 2016-2-24 18:43
 *@author mizeshuang
 */
public class Welcome{
	public static void main(String []args){
		String [] greeting =new String[3];
		greeting[0]="Welcome to core java";
		greeting[1]="by Cay Horstman";
		greeting[2]="and Gary Cornell";
		for(String g:greeting){
			System.out.println(g);
		}
		System.out.println("eel".hashCode());

	}
}
