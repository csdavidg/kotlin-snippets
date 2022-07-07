import strings.StringFunctions;

import java.util.List;
import java.util.stream.IntStream;

public class KotlinFunctionsCaller implements Clickable {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        StringFunctions.printCollection(list);
        StringFunctions.printCollection(list, ";");
        StringFunctions.printCollection(list, ";", "(");
        StringFunctions.printCollection(list, ";", "(", ")");

        System.out.println(StringFunctions.UNIX_LINE_SEPARATOR);

        System.out.println(StringFunctions.lastChar("Colombia"));
    }

    @Override
    public void click() {

    }

    @Override
    public void showOff() {
        Clickable.super.showOff();
    }
}
