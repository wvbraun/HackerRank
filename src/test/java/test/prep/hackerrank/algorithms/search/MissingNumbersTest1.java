package test.prep.hackerrank.algorithms.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.prep.hackerrank.algorithms.search.MissingNumbersTestable;

public class MissingNumbersTest1 {

	MissingNumbersTestable mNum;
	@Before
	public void setup()
	{
		mNum = new MissingNumbersTestable("10\n"
				+ "203 204 205 206 207 208 203 204 205 206\n"
				+ "13\n"
				+ "203 204 204 205 206 207 205 208 203 206 205 206 204\n");
	}
	
	@Test
	public void test() {
		assertEquals("204 205 206", mNum.start());
	}

}
