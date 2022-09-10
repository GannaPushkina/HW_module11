import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<String> source = Arrays.asList("Ganna", "Petro", "Olena", "Orest", "Volodymyr", "Yevhen", "Lev", "Azov", "Bayraktar", "Javelin");

        List<String> result = source.stream()
                .map(String::toUpperCase)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .toList();

        System.out.println(result);
    }
}