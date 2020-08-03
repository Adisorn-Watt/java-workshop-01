import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer not available", result);
    }

}