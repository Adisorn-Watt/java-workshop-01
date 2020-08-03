public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;

    public boolean isEmpty() {
        //return bufferSize == 10;
        for(int i=0; i<10; i++) {
            if(this.buffer[readPointer] == null) {
                readPointer++;
            }else {
                return false;
            }
        }
        return readPointer == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
        if(writePointer == 10) { //reset position
            writePointer = 0;
        }
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

    public void setSize(int newBufferSize) {
        this.buffer = new String[newBufferSize];
    }

    public boolean isItEqualtoCurrentSize(int newBufferSize) {
        return this.buffer.length == newBufferSize;
    }
}
