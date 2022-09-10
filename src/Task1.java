import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> source = Arrays.asList("Ganna", "Petro", "Olena", "Orest", "Volodymyr", "Yevhen", "Lev", "Azov", "Bayraktar", "Javelin");

        List<String> result = source.stream()
                .map(name -> source.indexOf(name) + ". " + name)
                .filter(n -> (int)n.charAt(0) % 2 != 0)
                .toList();

        System.out.println(result);
    }
}
