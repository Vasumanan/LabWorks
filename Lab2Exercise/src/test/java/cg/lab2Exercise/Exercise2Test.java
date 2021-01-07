package cg.lab2Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise2Test {
	private Exercise2 exercise2;
	private static String[] ARRAY_WITH_SINGLE_STRING = {"hello"};
    private static String EXPECTED_STRING = "HELLO";
    private static String[] EMPTY_ARRAY = new String[0];
	@Before
	public void setup() {
		exercise2 = new Exercise2();
	}
	@Test
	public void testSortstrings_GivenEmptyArray_ShouldReturnEmptyArrayAsString() {
		String result = exercise2.sortStrings(EMPTY_ARRAY);
		assertEquals("Empty Array",result);
	}
	@Test
	public void testSortstrings_GivenArrayWithSingleString_ShouldReturnThatString() {
		String result = exercise2.sortStrings(ARRAY_WITH_SINGLE_STRING);
		assertEquals(EXPECTED_STRING,result);
	}

}
