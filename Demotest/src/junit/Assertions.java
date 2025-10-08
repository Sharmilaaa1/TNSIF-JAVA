package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
public class Assertions {
		@Ignore
		 public void testAssertTrue()
		{
			assertTrue("Hello".contains("m"));
		}
		
		@Test
		 public void assertEqualsMethod()
		{
			int res= 2;
			int exp = 2;
			assertEquals(exp,res);
		}
		 public void testNull()
		{
			String s= null;
			assertNull(s);
		}
}
