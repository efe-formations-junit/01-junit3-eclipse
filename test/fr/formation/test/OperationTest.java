package fr.formation.test;

import junit.framework.TestCase;

public class OperationTest extends TestCase {
	
	private Operation op;
	
	@Override
	protected void setUp() throws Exception {
		op = new Operation();
	}

	public void testAddition() {
		assertEquals(14.0, op.addition(8.0, 6.0));
	}

	public void testSoustraction() {
		assertTrue(14.0 == op.soustraction(21.0, 7.0));
	}
}

