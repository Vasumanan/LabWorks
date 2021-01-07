package cg.lab2Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise3Test {
	private static int [] EMPTY_INTEGER_ARRAY= new int[0];
	private static int [] INTEGER_ARRAY_WITH_SINGLE_NUMBER= {1};
	private static int EXPECTED_SINGLE_NUMBER_AS_INTEGER=1;
	private Exercise3 exercise3 ;
	@Before
	public void setup() {
		exercise3 = new Exercise3();
	}
	@Test
	public void testGetsorted_GivenEmptyArray_ShouldReturn0AsInteger() {
		int []result = exercise3.getSorted( EMPTY_INTEGER_ARRAY);
		assertEquals(0,result.length);
	}

}
