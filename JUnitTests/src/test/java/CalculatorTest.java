import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
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

	// Tests the add method in Calculator
	@Test
	public void testAdd() {
		assertEquals(8, Calculator.add(5, 3));
		assertEquals(8, Calculator.add(3, 5));
		assertEquals(0, Calculator.add(0, 0));
		assertEquals(100, Calculator.add(98, 2));
	}

	@Test
	public void testSub() {
		assertEquals(2, Calculator.sub(5, 3));
		assertEquals(-2, Calculator.sub(3, 5));
		assertEquals(0, Calculator.sub(0, 0));
		assertEquals(96, Calculator.sub(98, 2));
	}

	@Test
	public void testMul() {
		assertEquals(15, Calculator.mul(5, 3));
		assertEquals(15, Calculator.mul(3, 5));
		assertEquals(0, Calculator.mul(0, 0));
		assertEquals(196, Calculator.mul(98, 2));
	}
	
	@Test
	public void testDiv() {
		assertEquals(1, Calculator.div(5, 3));
		assertEquals(0, Calculator.div(3, 5));
		assertEquals(49, Calculator.div(98, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivByZero() {
		Calculator.div(5, 0);
	}
}
