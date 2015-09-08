
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AddTest {

	private SomeMethods sm;

	@Before
	public void init() {
		sm = new SomeMethods();
	}

	@Test
	public void addTest() {
		System.out.println("First test");
		int k = sm.add(5, 10);
		assertTrue("", k == 15);
	}
}
