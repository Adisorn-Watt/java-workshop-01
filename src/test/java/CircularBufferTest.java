import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer have some stuff in it", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_A_read_A_then_write_B_read_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        assertEquals("A", cb.readData());
        cb.writeData("B");
        assertEquals("B", cb.readData());
    }

    @Test
    public void buffer_should_be_overwritten_at_buffer_size_10_by_writing_11_times() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        cb.writeData("Z");
        assertEquals("Z", cb.readData());
    }

    @Test
    public void buffer_should_be_overwritten_2nd_times_at_buffer_size_10_by_writing_21_times() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<21; i++) {
            cb.writeData("A" + i);
        }
        assertEquals("A20", cb.readData());
    }

    @Test
    public void set_new_size_of_buffer_to_14_and_checking_it() {
        CircularBuffer cb = new CircularBuffer();
        int newBufferSize = 14;
        cb.setSize(newBufferSize);
        boolean result = cb.isItEqualtoCurrentSize(newBufferSize);
        assertTrue("This isn't set to new size yet", result);
    }


}