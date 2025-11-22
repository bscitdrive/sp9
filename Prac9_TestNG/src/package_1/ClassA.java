package package_1;

import org.testng.annotations.Test;

public class ClassA {
	@Test
    public void testMethod1() {
        System.out.println("ClassA - testMethod1 (this will be included in testng.xml)");
    }

    @Test
    public void testMethod2() {
        System.out.println("ClassA - testMethod2");
    }
}
