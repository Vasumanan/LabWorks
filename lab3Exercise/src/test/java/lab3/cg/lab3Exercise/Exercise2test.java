package lab3.cg.lab3Exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Exercise2test {
	private static Exercise2 exercise2;
	private static String EMPTY_STRING="";
	private static String STRING_WITH_ONE_CHARACTER="V";
	private static String STRING_WITH_SPACE= "Good morning";
	private static String EXPECTED_STRING = "Good morning|gninrom dooG";
	@Before
	public void setup() {
		exercise2 = new Exercise2();
	}
	@Test
	public void testGetimage_GivenEmptyString_ShouldReturnGiveAnEmptyString() {
		String result = exercise2.getImage(EMPTY_STRING);
		assertEquals("Given an Empty String",result);
	}
	@Test
	public void testGetimage_GivenStringWithOneCharacter_ShouldReturnSameString() {
		String result = exercise2.getImage(STRING_WITH_ONE_CHARACTER);
		assertEquals("V|V",result);
	}
	@Test
	public void testGetimage_GivenStringWithSpace_ShouldReturnReverseStringWithSpace() {
		String result = exercise2.getImage(STRING_WITH_SPACE);
		assertEquals(EXPECTED_STRING,result);
	}

}
