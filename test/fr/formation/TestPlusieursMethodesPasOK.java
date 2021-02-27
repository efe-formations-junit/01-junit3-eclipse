	
	
	package fr.formation;
	
	import junit.framework.TestCase;
	
	public class TestPlusieursMethodesPasOK extends TestCase {
		
		public void testExemple1()  {
			assertEquals(10, 4 + 6);
		}
		
		public void testExemple2()  {
			assertNull(new String ("Chaine"));
		}
	}
	
	
