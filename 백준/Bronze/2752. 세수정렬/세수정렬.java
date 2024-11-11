import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = List.of(reader.readLine().split(" "));

        numbers.stream()
                .map(Integer::parseInt)
                .sorted(Integer::compareTo)
                .forEach(num -> System.out.print(num + " "));
    }
}


