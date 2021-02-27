	
	
	package fr.formation;
	
	import junit.framework.TestCase;
	
	public class TestExemple extends TestCase {
		
		public void testExemple1() {
			int x = 4;
			int y = 6;
			int resultatAttendu = 10; 
			assertEquals(resultatAttendu, x + y);
		}
	
		public void testExemple2() {
			int x = 4;
			int y = 6;
			assertTrue("x doit être plus petit que y", x < y);
		}
	
		public void testExemple3() {
			int x = 14;
			int y = 6;
			assertTrue("x doit être plus petit que y", x < y);
		}
		
		public void testExemple4() {
			String s1 = new String("A");
			String s2 = new String("A");
	
			assertNotSame("s1 et s2", s1, s2);
		}
	
		public void testExemple5() {
			String s1 = "A";
			String s2 = "A";
	
			assertNotSame("s1 et s2", s1, s2);
		}
	
		public void testExemple6() {
			int x = 4;
			int y = 6;
			
			assertTrue( x + y < 50); // OK : testé
			assertTrue( x > 5);		 // Pas OK : testé
			assertTrue( x + y > 0 ); // OK : Pas testé
		}
	
	}

	
	