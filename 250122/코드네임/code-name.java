import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];

        for (int i = 0; i < 5; i++) {
            String codeName = sc.next();
            Integer score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
        }

        Arrays.stream(agents).min((a1, a2) -> a1.score - a2.score)
                .ifPresent(agent -> System.out.println(agent.codeName + " " + agent.score));

    }
}

class Agent {
    String codeName;
    Integer score;

    public Agent(String codeName, Integer score) {
        this.codeName = codeName;
        this.score = score;
    }
}