package co.g2academy.basic;

public class StaticVarExample {

	public static String myClassVar = "class or static variable";

	public static void main(String args[]) {
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();

		//all three will display "class or static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		obj2.myClassVar = "Changed text";
		StaticVarExample.myClassVar = "Changed text";

		//All three will display "Changed Text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}

}