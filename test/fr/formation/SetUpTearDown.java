
	package fr.formation;
	
	import junit.framework.TestCase;
	
	public class SetUpTearDown extends TestCase {
		
		protected void setUp() throws Exception {
	        System.out.println( "Avant chaque méthode de test" );
	    }
	    
	    public void test1() {
	        System.out.println( "    Test 1" );
	    }
	
	    public void test2() {
	        System.out.println( "    Test 2" );
	    }
	
	    public void test3() {
	        System.out.println( "    Test 3" );
	    }
	
	    protected void tearDown() throws Exception {
	        System.out.println( "Après chaque méthode de test");
	    }
	}

	
	