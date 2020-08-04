import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer();

    //@Test
    //public void create_new_buffer_with_size

    @Test
    public void create_new_buffer_should_empty() {
        boolean result = cb.isEmpty();
        assertTrue("Buffer have some stuff in it", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        //System.out.println(cb.isFull());
        assertTrue("Buffer is not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_A_read_A_then_write_B_read_B() {
        cb.writeData("A");
        assertEquals("A", cb.readData());
        cb.writeData("B");
        assertEquals("B", cb.readData());
    }

    @Test
    public void buffer_should_be_overwritten_at_buffer_size_10_by_writing_11_times() {
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        cb.writeData("Z");
        assertEquals("Z", cb.readData());
    }

    @Test
    public void buffer_should_be_overwritten_2nd_times_at_buffer_size_10_by_writing_21_times() {
        for(int i=0; i<21; i++) {
            cb.writeData("A" + i);
        }
        assertEquals("A20", cb.readData());
    }

    @Test
    public void set_new_size_of_buffer_to_14_and_checking_it() {
        int newBufferSize = 14;
        //cb.setSize(newBufferSize);
        CircularBuffer cb = new CircularBuffer(newBufferSize);
        boolean result = cb.isItEqualCurrentSize(newBufferSize);
        assertTrue("This isn't set to new size yet", result);
    }
}