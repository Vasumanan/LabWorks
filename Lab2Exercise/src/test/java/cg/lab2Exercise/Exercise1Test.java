package cg.lab2Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise1Test {
	private static int [] EMPTY_INTEGER_ARRAY= new int[0];
	private static int [] INTEGER_ARRAY_WITH_SINGLE_NUMBER= {1};
	private static int EXPECTED_SINGLE_NUMBER_AS_INTEGER=1;
	private Exercise1 exercise1 ;
	@Before
	public void setup() {
		exercise1 = new Exercise1();
	}
	@Test
	public void testGetsecondSmallest_GivenEmptyArray_ShouldReturn0AsInteger() {
		int result = exercise1.getSecondSmallest( EMPTY_INTEGER_ARRAY);
		assertEquals(0,result);
	}
	@Test
	public void testGetsecondSmallest_GivenArrayWith1Number_ShouldReturnThatNumberAsInteger() {
		int result = exercise1.getSecondSmallest(INTEGER_ARRAY_WITH_SINGLE_NUMBER);
		assertEquals(EXPECTED_SINGLE_NUMBER_AS_INTEGER,result);
	}
}
