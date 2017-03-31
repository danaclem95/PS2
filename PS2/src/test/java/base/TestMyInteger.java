package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestMyInteger() {
		
		MyInteger a = new MyInteger(20);
		boolean expectedIsOdd = false;
		boolean expectedIsEven = true;
		boolean expectedIsPrime = false;

		

		assertEquals(a.isOdd(), false);
		assertEquals(a.isEven(), expectedIsEven);
		assertEquals(a.isPrime(), expectedIsPrime);	
		
		int i = 20;
		int j = 21;
		
		assertEquals(a.equals(i), true);
		assertEquals(a.equals(j), false);

	}}
