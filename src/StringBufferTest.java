import java.util.Arrays;

public class StringBufferTest {

    private Character[] buffer = new Character[32];

    public synchronized String getBuffer() {
        return Arrays.toString(buffer);
    }

    public boolean isValue() { return (size() > 0) ? true : false; }

    private int size() {
        int count = 0;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] instanceof Character) count++;
            else return count;
        }
        return count;
    }

    public synchronized void simulationAppend(Character buffer) {
        var size = size();
        int index = (size == 0) ? 0 : size++;
        this.buffer[index] = buffer;
    }

    public static void main(String[] args) {

        StringBufferTest stringBufferTest = new StringBufferTest();

        for (int i = 0; i < 5; i++) {

            new Thread(() -> {
                stringBufferTest.simulationAppend('o');
                stringBufferTest.simulationAppend('l');
                stringBufferTest.simulationAppend('a');
                System.out.println(Thread.currentThread().getName() +
                        " Result: " + stringBufferTest.getBuffer());
            }).start();
        }
    }
}