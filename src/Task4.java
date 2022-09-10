import java.util.List;
import java.util.stream.Stream;

public class Task4 {

    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 667L;

        List<Long> result = Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(30)
                .toList();

        System.out.println(result);
    }
}
