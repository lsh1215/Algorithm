import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        System.out.println("code : "+ bomb.code);
        System.out.println("color : "+ bomb.color);
        System.out.println("second : " + bomb.second); 
    }
}

class Bomb{
    String code;
    char color;
    int second;

    public Bomb(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}