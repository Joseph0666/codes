import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value");
		String str=input.nextLine();
		String s="";int k=0;
		int j,number=0;
		for(int i=0;i<str.length();i++)
		{
			 j=k=i;number=0;
		while(j<str.length()&&Character.isDigit(str.charAt(j)))
		{
			number=number*10+Character.getNumericValue(str.charAt(j));
			j++;
			i++;
		}
		k-=1;
		while(number>0)
		{
		s+=str.charAt(k);
		number--;
		}
		}
		System.out.println(s);
		input.close();


	}
}
