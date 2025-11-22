package package_1;

import org.testng.annotations.Test;

public class ClassB {
	@Test
    public void testMethod1() {
        System.out.println("ClassB - testMethod1 (this will be included in testng.xml)");
    }

    @Test
    public void testMethod2() {
        System.out.println("ClassB - testMethod2");
    }
}
