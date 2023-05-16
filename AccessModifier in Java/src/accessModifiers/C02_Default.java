package accessModifiers;


class A{
	 int x = 10;
	 
	 public void b1(){
		 System.out.println("This is a print method");
	 }
	 
	 protected int y = 200;
	 
	 void protectedMethod() {
		 System.out.println("This is Protected method");
	 }
	
}


public class C02_Default {
	

	public static void main(String[] args) {
		A obj = new A();
		System.out.println("Value of x is "+ obj.x);
		System.out.println("value of y is "+ obj.y);
		obj.b1();
		obj.protectedMethod();
		
	}

}















/*

default  -- within the package
public -- within the project
private -- within the class
protected -- within the package	 and other package of subclass

*/
