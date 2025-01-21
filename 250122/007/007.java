import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        char place = sc.next().charAt(0);
        Integer time = sc.nextInt();

        Agent007 agent = new Agent007(code, place, time);

        System.out.println("secret code : " + agent.secretCode);
        System.out.println("meeting point : " + agent.place);
        System.out.println("time : " + agent.time);

    }
}

class Agent007 {
    String secretCode;
    char place;
    Integer time;

    public Agent007(String secretCode, char place, Integer time) {
        this.secretCode = secretCode;
        this.place = place;
        this.time = time;
    }
}