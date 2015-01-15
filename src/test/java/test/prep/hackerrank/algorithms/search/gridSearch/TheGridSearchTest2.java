package test.prep.hackerrank.algorithms.search.gridSearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.prep.hackerrank.algorithms.search.TheGridSearchTestable;

public class TheGridSearchTest2 
{
	TheGridSearchTestable gs;

	@Before
	public void setup()
	{
		gs = new TheGridSearchTestable("15 15\n"
				+ "400453592126560\n"
				+ "114213133098692\n"
				+ "474386082879648\n"
				+ "522356951189169\n"
				+ "887109450487496\n"
				+ "252802633388782\n"
				+ "502771484966748\n"
				+ "075975207693780\n"
				+ "511799789562806\n"
				+ "404007454272504\n"
				+ "549043809916080\n"
				+ "962410809534811\n"
				+ "445893523733475\n"
				+ "768705303214174\n"
				+ "650629270887160\n"
				+ "2 2\n"
				+ "99\n"
				+ "99");
	}
	@Test
	public void test() {
		assertEquals("NO", gs.start());
	}

}
