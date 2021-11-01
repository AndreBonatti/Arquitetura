import java.util.Arrays;

public class StringBuilderTest {

    private Character[] buffer = new Character[32];

    public String getBuffer() {
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

    public void simulationAppend(Character buffer) {
        var size = size();
        int index = (size == 0) ? 0 : size++;
        this.buffer[index] = buffer;
    }

}