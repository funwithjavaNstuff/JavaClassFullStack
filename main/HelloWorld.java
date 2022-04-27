package main;
// Your First Program

public class HelloWorld {
	
	// boss wants us to write a program that adds one 
	// to a given input
	
	
	//java doc below
	
	/**
	 * This function returns the next int after input
	 * @param input
	 * @return input+1
	 */
	public static int numberPlusOne(int input) {
		return input + 1;
		
	}
	
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        System.out.println(numberPlusOne(4));
    }
}


