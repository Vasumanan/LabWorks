package lab3.cg.lab3Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise1test {
	private static Exercise1 exercise1;
	private static String EMPTY_STRING="";
	private static String INVALID_STRING="abd";
	private static String VALID_STRING="10 20";
	private static int EXPECTED_SUM = 30;
	@Before
	public void setup() {
		exercise1 = new Exercise1();
	}
	@Test
	public void testFindsum_GivenEmptyString_ShouldReturn0AsInteger() {
		int result = exercise1.findSum(EMPTY_STRING);
		assertEquals(0,result);
	}
	@Test
	public void testFindsum_GivenString10and20_ShouldReturn30AsInteger() {
		int result = exercise1.findSum(VALID_STRING);
		assertEquals(EXPECTED_SUM,result);
	}
	@Test (expected = NumberFormatException.class)
	public void testFindsum_GivenInvalidString_ShouldReturnInvalidString() {
		int result = exercise1.findSum(INVALID_STRING);
	}
}
