import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<String> source = Arrays.asList("1, 2, 0", "4, 5");

        List<String> result = source.stream()
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(x -> x.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
