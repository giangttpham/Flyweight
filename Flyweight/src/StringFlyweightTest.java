import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StringFlyweightTest {

	StringPool testStrFlyweight;
	
	@Before
	public void setUp() throws Exception {
		testStrFlyweight = new StringPool();
		String testStr = "The dog is playing with the baby who is laughing with excitement";
		testStrFlyweight.read(testStr);	
	}

	@Test
	public void testGet() {
		String newStr = "The baby is filled with excitement";
		testStrFlyweight.read(newStr);
		int size = testStrFlyweight.size();
		assertTrue(size == 10);
	}

	@Test
	public void testRemove() {
		testStrFlyweight.remove("the");
		testStrFlyweight.remove("the");
		testStrFlyweight.remove("the");
		assertTrue (testStrFlyweight.size() == 9);
	}

	@Test
	public void testClear() {
		testStrFlyweight.clear();
		assertTrue(testStrFlyweight.size() == 0);
	}
}
