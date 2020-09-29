package testsuite;
import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import employee.EmployeeTest;
import palindrome.MyStringsTest;

@RunWith(Suite.class)
@SuiteClasses({
	EmployeeTest.class,
	MyStringsTest.class
})
public class MyTestSuite {

}
