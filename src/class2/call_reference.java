package class2;

public class call_reference{
	
	  int data=20;
	  
	  static void increase(call_reference c) {
		  c.data=c.data*10;
	  }

	public static void main(String[] args) {
		
		call_reference obj=new call_reference();
		System.out.println(obj.data);
		
		increase(obj);
		
		System.out.println(obj.data);

	}

}
