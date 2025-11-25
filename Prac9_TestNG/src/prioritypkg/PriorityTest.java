/*
Write a TestNg script and configure xml file to prioritize test methods.
*/
package prioritypkg;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 2)
    public void testMethodOne() {
        System.out.println("Executing Test Method 1 - Priority 2");
    }

    @Test(priority = 1)
    public void testMethodTwo() {
        System.out.println("Executing Test Method 2 - Priority 1");
    }

    @Test(priority = 3)
    public void testMethodThree() {
        System.out.println("Executing Test Method 3 - Priority 3");
    }
}
