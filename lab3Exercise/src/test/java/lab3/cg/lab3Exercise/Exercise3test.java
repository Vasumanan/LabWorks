package lab3.cg.lab3Exercise;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Exercise3test {
	private static Exercise3 exercise3;
	private static String EMPTY_STRING="";
	private static String STRING_WITH_NUMBERS="VGSF123";
    private static String STRING_WITH_SPACE= "Good morning";
	private static String EXPECTED_STRING = "Hooe nosoioh";
	@Before
	public void setup() {
		exercise3 = new Exercise3();
	}
	@Test
	public void testAlterstring_GivenEmptyString_ShouldReturnGiveAnEmptyString() {
		String result = exercise3.alterString(EMPTY_STRING);
		assertEquals("Given an Empty String",result);
	}
	@Test
	public void testAlterstring_GivenStringWithSpace_ShouldReturnAlteredStringWithSpace() {
		String result = exercise3.alterString(STRING_WITH_SPACE);
		assertEquals(EXPECTED_STRING,result);
	}
	@Test (expected = RuntimeException.class)
	public void testAlterstring_GivenStringWithNumbers_ShouldThrowRunTimeException() {
		String result = exercise3.alterString(STRING_WITH_NUMBERS);
	}

}
