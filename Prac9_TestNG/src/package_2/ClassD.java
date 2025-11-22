package package_2;

import org.testng.annotations.Test;

public class ClassD {
	@Test
    public void testMethod1() {
        System.out.println("ClassD - testMethod1 (this will be included in testng.xml)");
    }

    @Test
    public void testMethod2() {
        System.out.println("ClassD - testMethod2");
    }
}
