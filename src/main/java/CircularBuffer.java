public class CircularBuffer {
    private final int bufferSize;
    private final String[] buffer; //final can be set value in constructor only
    private int readPointer;
    private int writePointer;

    // Default constructor
    public CircularBuffer() {
        this(10);
    }

    // Overload constructor
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        if(writePointer == 10) { //reset position
         writePointer = 0;
        }
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        System.out.println(writePointer);
        System.out.println(bufferSize);
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

    public void setSize(int newBufferSize) {
        //this.buffer = new String[newBufferSize];
        new CircularBuffer(newBufferSize);
    }

    public boolean isItEqualCurrentSize(int newBufferSize) {
        return this.buffer.length == newBufferSize;
    }
}
