package fr.formation;

import junit.framework.TestCase;

public class TestStringFail extends TestCase {

	public void testFail1() {
		fail();
	}
	public void testFail2() {
		fail("Message d'erreur");
	}

	public void testFail3() {
		String msg1 = "A";
		String msg2 = "B";
		failNotEquals("Not equals : ", msg1, msg2);
	}

	public void testFail4() {
		failSame("The object");
	}


	public void testFail5() {
		String msg1 = "A";
		String msg2 = "B";
		failNotSame("Not same : ", msg1, msg2);
	}

}


