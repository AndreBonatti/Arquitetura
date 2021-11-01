
public class StringTest {

    private Character[] string;

    public StringTest(Character[] String) {
        this.string = string;
    }

    public String getString() {
        return string.toString();
    }

    public static void main(String[] args) {
        Character[] charArray = {'r', 's', 't', 'u', 'v'};
        StringTest test = new StringTest(charArray);
    }
}
