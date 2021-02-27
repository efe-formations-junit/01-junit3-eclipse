	
	
	package fr.formation;
	
	import junit.framework.TestCase;
	
	public class TestExceptions extends TestCase {
		
		
		public void testDivisionSimple() {
			double a = 14.4;
			double b = 2.0;
			double expected = 7.2;
			
			assertEquals(expected, division(a, b));
		}
		
		public void testDivisionParZero() {
			double a = 14.4;
			double b = 0.0;
			
			try {
				division(a, b);
					// Si passage ici, c'est que l'exception n'est pas levée
				fail("Division par zero non gérée");
			}
			catch (ArithmeticException e) {
				// Rien à ajouter
			}
		}
		
		
		
		private double division(double num, double denom) throws ArithmeticException {
			if (denom == 0.0) 
				throw new ArithmeticException("Denom égal à 0");
			else
				return num / denom;
		}
	
	}

	
	