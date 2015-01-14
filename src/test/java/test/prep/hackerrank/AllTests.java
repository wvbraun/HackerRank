package test.prep.hackerrank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.prep.hackerrank.algorithms.search.MissingNumbersTest1;
import test.prep.hackerrank.algorithms.search.MissingNumbersTest2;
import test.prep.hackerrank.algorithms.search.MissingNumbersTest3;

@RunWith(Suite.class)
@SuiteClasses({MissingNumbersTest1.class,
			   MissingNumbersTest2.class,
			   MissingNumbersTest3.class})

public class AllTests {

}
