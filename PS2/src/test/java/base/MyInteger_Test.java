package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	static MyInteger myInt;
	static MyInteger myInt2;
	static MyInteger myInt3;
	static MyInteger myInt4;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myInt = new MyInteger(9);
		myInt2 = new MyInteger(10);
		myInt3 = new MyInteger(11);
		myInt4 = new MyInteger(2);
		
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
	public void PrimeWithNoArgsTest() {
		assertFalse(myInt.isPrime());
		assertTrue(myInt3.isPrime());
		assertTrue(myInt4.isPrime());
	}
	@Test
	public void EvenWithNoArgsTest(){
		assertFalse(myInt.isEven());
		assertTrue(myInt2.isEven());
	}
	@Test
	public void OddWithNoArgsTest(){
		assertTrue(myInt.isOdd());
		assertFalse(myInt2.isOdd());
	}
	@Test
	public void PrimeWithIntValArg(){
		assertFalse(MyInteger.isPrime(9));
		assertTrue(MyInteger.isPrime(11));
	}
	@Test
	public void EvenWithIntValArg(){
		assertFalse(MyInteger.isEven(9));
		assertTrue(MyInteger.isEven(10));
	}
	@Test
	public void OddWithIntValArg(){
		assertFalse(MyInteger.isOdd(10));
		assertTrue(MyInteger.isOdd(111));
	}
	@Test
	public void PrimeWithMyIntegerArg(){
		assertFalse(MyInteger.isPrime(myInt));
		assertTrue(MyInteger.isPrime(myInt3));
	}
	@Test
	public void EvenWithMyIntegerArg(){
		assertFalse(MyInteger.isEven(myInt));
		assertTrue(MyInteger.isEven(myInt2));
	}
	@Test
	public void OddWithMyIntegerArg(){
		assertTrue(MyInteger.isOdd(myInt));
		assertFalse(MyInteger.isOdd(myInt2));
	}
	@Test
	public void EqualsIntValTest(){
		assertTrue(myInt.equals(9));
		assertFalse(myInt.equals(10));
		assertFalse(myInt.equals(myInt2));
		assertTrue(myInt2.equals(myInt2));
	}

}
