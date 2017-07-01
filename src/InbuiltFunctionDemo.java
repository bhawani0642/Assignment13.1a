
public class InbuiltFunctionDemo {
	//Taking an static variable a 
	static int a = 10;
// creating an method display
	void display() {
		//print line statement here a is converted into string
		System.out.println("Integer converted into String " + (a+10));
	}
    // main method
	public static void main(String[] args) {
       // creating object of InbuiltFunctionDemo class
		InbuiltFunctionDemo obj = new InbuiltFunctionDemo();
		// Using String.valueOf method converting the value of int a into string
		String s = String.valueOf(a);
		// calling the display method
		obj.display();

	}

}
