package accessModifiers;


class B {
	int x = 100;	
}

public class C01_Private {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		int value = obj.x;
		System.out.println(value);

	}

}
