import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_adisorn_should_return_Hello_Adisorn() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("adisorn");
        assertEquals("Hello Adisorn", result);
    }

    @Test
    public void sayHi_with_earth_should_return_Hello_Earth() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("earth");
        assertEquals("Hello Earth", result);
    }

}