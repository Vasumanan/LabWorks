package cg.lab2Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class Exercise4Test {
	private static int [] EMPTY_INTEGER_ARRAY= new int[0];
	private static int [] INTEGER_ARRAY_WITH_SINGLE_NUMBER= {001};
	private static int EXPECTED_NUMBER_IN_ARRAY=1;
	private Exercise4 exercise4 ;
	@Before
	public void setup() {
		exercise4 = new Exercise4();
	}
	@Test
	public void testModifyArray_GivenEmptyArray_ShouldReturn0AsInteger() {
		int []result = exercise4.modifyArray( EMPTY_INTEGER_ARRAY);
		assertEquals(0,result.length);
	}
	@Test
	public void testModifyArray_GivenArrayWithNumberPreceedingWithZeros_ShouldReturn1() {
		int []result = exercise4.modifyArray(INTEGER_ARRAY_WITH_SINGLE_NUMBER);
		assertEquals(EXPECTED_NUMBER_IN_ARRAY,result[0]);
	}

}
