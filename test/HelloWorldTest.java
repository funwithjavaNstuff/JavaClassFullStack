package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.HelloWorld;

/**
 * 
 * @author mainjava
 *
 */

class HelloWorldTest {
	
	/**
	 * 
	 */

	@Test
	void test() {
		Random random = new Random();
		int randomNumber = random.nextInt();
		assertTrue(HelloWorld.numberPlusOne(randomNumber) == randomNumber + 1);
	
	}

}

