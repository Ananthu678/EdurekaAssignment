package class2;

public class functions_1 {
	
	static int sum(int num1, int num2) {
		
		int result;
		result=num1+num2;
		return result;
		
	}
	
	static void increase(int p1) {
		p1=p1+1;
		System.out.println(p1);
	}

	public static void main(String[] args) {
		
		int a=10, b=20;
		int x=10;
		
		increase(x);
		System.out.println(x);
		
		int c=sum(a,b);
		System.out.println(c);
	}

}
