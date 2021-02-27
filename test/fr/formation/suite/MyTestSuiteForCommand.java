
package fr.formation.suite;

import fr.formation.TestPlusieursMethodesOK;
import fr.formation.TestPlusieursMethodesPasOK;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MyTestSuiteForCommand {

	public static Test suite() {

		TestSuite suite = new TestSuite();

		suite.addTestSuite(TestPlusieursMethodesOK.class);
		suite.addTestSuite(TestPlusieursMethodesPasOK.class);

		return suite;
	}
}
