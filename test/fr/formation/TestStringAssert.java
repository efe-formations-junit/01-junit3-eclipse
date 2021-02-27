package fr.formation;

import junit.framework.TestCase;

public class TestStringAssert extends TestCase {

	public void testConcat1() {
		String debut = "Hello";
		String fin = "World";
		String attendu = "HelloWorld";

		String resultat = debut.concat(fin);

		assertEquals(attendu, resultat);
	}

	public void testConcat2() {
		String debut = "Hello";
		String fin = "World";
		String attendu = "Bonjour";

		String resultat = debut.concat(fin);

		assertEquals(attendu, resultat);
	}


	public void testConcat3() {
		String debut = "Hello";
		String fin = "World";
		String attendu = "Bonjour";

		String resultat = debut.concat(fin);

		assertEquals("Le test de concaténation a échoué", attendu, resultat);
	}
}


