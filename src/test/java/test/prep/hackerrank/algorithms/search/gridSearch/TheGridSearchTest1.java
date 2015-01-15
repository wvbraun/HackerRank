package test.prep.hackerrank.algorithms.search.gridSearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.prep.hackerrank.algorithms.search.TheGridSearchTestable;

public class TheGridSearchTest1 {

	private TheGridSearchTestable gs;
	
	@Before
	public void setup()
	{
		gs = new TheGridSearchTestable("10 10\n"
				+ "7283455864\n"
				+ "6731158619\n"
				+ "8988242643\n"
				+ "3830589324\n"
				+ "2229505813\n"
				+ "5633845374\n"
				+ "6473530293\n"
				+ "7053106601\n"
				+ "0834282956\n"
				+ "4607924137\n"
				+ "3 4\n"
				+ "9505\n"
				+ "3845\n"
				+ "3530\n");
	}
	
	@Test
	public void test() {
		assertEquals("YES", gs.start());
	}

}
