package lab3.cg.lab3Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class Exercise4test {
	private static Exercise4 exercise4;
	private static int ZERO_INUPT=0;
	private static int NEGATIVE_INPUT=-123;
	private static int VALID_NUMBER=123;
	private static int EXPECTED=113;
	@Before
	public void setup() {
		exercise4= new Exercise4();
	}
	@Test
	public void testModifynumber_GivenInputAs0_ShouldReturn0AsInteger() {
		int result = exercise4.modifyNumber(ZERO_INUPT);
		assertEquals(0,result);
	}
	@Test
	public void testModifynumber_GivenInputAs123_ShouldReturn113AsInteger() {
		int result = exercise4.modifyNumber(VALID_NUMBER);
		assertEquals(EXPECTED,result);
	}
	@Test(expected = RuntimeException.class)
	public void testModifynumber_GivenNegativeNumber_ShouldThrowRuntimeException() {
		int result = exercise4.modifyNumber(NEGATIVE_INPUT);
	}

}
