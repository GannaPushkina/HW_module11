import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {

        List<String> firstList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven");
        List<String> secondList = Arrays.asList("1", "2", "3", "4", "5");

        Stream<String> firstStream = firstList.stream();
        Stream<String> secondStream = secondList.stream();

        List<String> result = zip(firstStream, secondStream).toList();

        System.out.println(result);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (i1.hasNext() & i2.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(i1.next(), i2.next()));
        }
        return resultStream;
    }
}
