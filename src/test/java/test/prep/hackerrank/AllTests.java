package test.prep.hackerrank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.prep.hackerrank.algorithms.arrays.insertionSortA.InsertionSortATest1;
import test.prep.hackerrank.algorithms.search.gridSearch.TheGridSearchTest1;
import test.prep.hackerrank.algorithms.search.gridSearch.TheGridSearchTest2;
import test.prep.hackerrank.algorithms.search.missingNumbers.MissingNumbersTest1;
import test.prep.hackerrank.algorithms.search.missingNumbers.MissingNumbersTest2;
import test.prep.hackerrank.algorithms.search.missingNumbers.MissingNumbersTest3;

@RunWith(Suite.class)
@SuiteClasses({MissingNumbersTest1.class,
			   MissingNumbersTest2.class,
			   MissingNumbersTest3.class,
			   TheGridSearchTest1.class,
			   TheGridSearchTest2.class,
			   InsertionSortATest1.class})

public class AllTests {

}
