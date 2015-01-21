package test.prep.hackerrank.algorithms.arrays.insertionSortA;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.prep.hackerrank.algorithms.arrays.InsertionSortATestable;

public class InsertionSortATest1 {

   private InsertionSortATestable is;
   
   @Before
   public void setup()
   {
      is = new InsertionSortATestable("5\n"
            + "2 4 6 8 3");
   }
   
   @Test
   public void test() {
      assertArrayEquals(new int[] {2, 3, 4, 6, 8}, is.start());
   }

}
