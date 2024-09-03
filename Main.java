import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static String sortAndFormatNumbers(String[] inputArray) {

        return Arrays.stream(inputArray)
                .flatMap(line -> Arrays.stream(line.split(",\\s*")))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(TreeSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};

        String result = sortAndFormatNumbers(inputArray);
        System.out.println(result);
    }
}
