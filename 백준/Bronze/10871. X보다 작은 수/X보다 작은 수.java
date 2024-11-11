import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");

        int N = parseInt(input[0]);
        int X = parseInt(input[1]);

        List<Integer> secondLine = List.of(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

        secondLine.stream().filter(i -> i < X).forEach(i -> System.out.print(i + " "));
    }
}


