package sony;

public class SonyClass {

	static int a ;
	public static void main(String[] args) {
		
		System.out.println("Sony class results");
		method1(20);
		System.out.println("Sony class results"+ a);
	}
	
	public static void method1(int a)
	{
		a=40;
		System.out.println("Hello world: "+ a);
		
		
	}
}
