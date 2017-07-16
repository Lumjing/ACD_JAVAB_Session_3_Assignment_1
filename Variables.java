/*Write a program in java to differentiate between instance variables and class variables. And also
show the scope of each.
Hint: - Class variables are those variables which are declared as static.
*/
package assignment3;

public class Variables {
	//Declaring a Static Variable with static modifiers
	static int a=10;
	static int b=20;
	//Instance Variables declaration and assign
	int c=30;
	int d=40;

	public static void main(String[] args) {
	//The static variables can be called directly without an object
		System.out.println("Sum of two numbers is:" +(Variables.a +Variables.b));
	//An object has to be created to call instance variable
		Variables NewObj=new Variables();
		System.out.println("Sum of two instance varaibales is:" +(NewObj.c + NewObj.d));
	//Object is already created so just call local variables
		NewObj.m1();
		
	}
	void m1()
	{
		System.out.println("The sum of two local varaibles" +(c+d));
	}
}

