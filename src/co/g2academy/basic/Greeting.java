package co.g2academy.basic;//this is class greeting that only have 1 method greet

/*
 this is multiline comment using slash and star
*/

/** This is class Greeting in Java Documentation 
* so we can generate java doc
*
*/
public class Greeting {
	
	public String name;

	public void greet() {
		System.out.println("hi ini " 
			+ name + " length:" + name.length());
	}

}