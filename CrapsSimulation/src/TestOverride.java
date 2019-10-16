import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestOverride
{
	@Test
	void test()
	{
		Die testDie = new Die();
	    String test1 = testDie.testStatic();
	    testDie = new CrookedDie1();
	    String test2 = testDie.testStatic();
	    assertEquals(test1,test2);
	}

}
