import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractShapesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		AbstractShapes.Square s1 = new AbstractShapes.Square(5);
		assertTrue(25 == s1.getArea());
	}

}
