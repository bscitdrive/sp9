package enablepkg;

import org.testng.annotations.Test;

public class EnableTest {
	@Test(enabled = false)
    public void testMethodOne() {
        System.out.println("This is Test Method 1 (disabled).");
    }

    @Test(enabled = true)
    public void testMethodTwo() {
        System.out.println("This is Test Method 2 (enabled).");
    }

    @Test(enabled = true)
    public void testMethodThree() {
        System.out.println("This is Test Method 3 (enabled).");
    }
}
