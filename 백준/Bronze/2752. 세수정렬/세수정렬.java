import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = List.of(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

        numbers.sort(Integer::compareTo);

        numbers.forEach(num -> System.out.print(num + " "));
    }
}


