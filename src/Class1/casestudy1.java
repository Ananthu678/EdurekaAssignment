package Class1;

import java.util.Scanner;

public class casestudy1 {

	public static void main(String[] args) {
		
		int ticket_price =400;
		int n=3; int a = 0;
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number of tickets");
			a=sc.nextInt();
		
			int new_price, total_price;
		
		if(a>=10) {
			new_price=ticket_price*a;
			new_price-=new_price*10/100;
		    System.out.println(new_price);
		}
		
		else
		{
			total_price=ticket_price*a;
			System.out.println(total_price);
		}

	}

}
}
