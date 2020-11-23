package co.g2academy.basic;

public class InstanceVarExample {

	public String myInstanceVar = "class or static variable";

	public static void main(String args[]) {
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();

		//all three will display "class or static variable"
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed text";

		//only obj2 will display "Changed Text"
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}

}