import java.util.Scanner;
import java.lang.*;

public class BinToDec 
{
	public static void main(String[] args) 
	{
	  int num;
	  int i = 0;
	  double sum = 0;
	  System.out.println("Enter binary Number");
	  Scanner s = new Scanner(System.in);
	  num = s.nextInt();
	  
	  while(num != 0)
	  {
		  int x = num % 10;
		  sum = sum +( Math.pow(2,i) * x);
		  i++;
		  num = num/10;
		  
	 }
	  System.out.println("Decimal: "+sum);
	}
	

}
