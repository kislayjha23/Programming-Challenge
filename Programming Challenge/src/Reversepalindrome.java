
import java.util.Scanner;
public class Reversepalindrome {
	
		public static void main(String arg[])
		{
			try{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the word you want to check for palindrome:");
			String str = "";
			String rev="";
			str = sc.nextLine();
			int len = str.length();
			
			for(int i=len-1;i>=0;i--){
				rev= rev+(str.charAt(i)+"");
			//System.out.println(rev);
			}
			System.out.println("the reverse of the word is :"+rev);
			if(str.equals(rev)){
				System.out.println("its a  palidrome");	
			}
			else
				System.out.println("its not a  palidrome");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
