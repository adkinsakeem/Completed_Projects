package Names;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.junit.Test;

public class NameVerificationTest {
	public static String[] testNames = {"John Smith", "David James", "William Samuel Dixon J.R.", "Daniel Hunt", "Marcus Bishop II", "Bill Davis", "Rick Samuel IV", "Marcus Bishop III"}; 
	public static Boolean[] testAnswers = {true, false, true, false, true, false, true, false}; 
	public static int num1 = 0;
	String testName = "Bill Davis Jr.";
	Boolean testAnswer = true;
	@Test
	public void test1() throws FileNotFoundException, IOException {
		
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	@Test
	public void test2() throws FileNotFoundException, IOException {
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	
	@Test
	public void test3() throws FileNotFoundException, IOException {
		
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	
	@Test
	public void test4() throws FileNotFoundException, IOException {
		
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	
	@Test
	public void test5() throws FileNotFoundException, IOException {
		
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	
	@Test
	public void test6() throws FileNotFoundException, IOException {
		
		if(testNames.length > num1 && testAnswers.length > num1){
		Main verificationTester = new Main();
		testName = testNames[num1];
		Boolean output = verificationTester.main(testName);
		assertEquals(testAnswers[num1], output);
		System.out.println("Expected Answer: "+ testAnswers[num1]);
		System.out.println("Actual Answer: " + output);
		num1++;
		}
	}
	
	
	

}
