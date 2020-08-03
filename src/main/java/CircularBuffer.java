public class CircularBuffer {
    private int bufferSize = 10;

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }
}
