import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        User user = new User();
        System.out.println("user "+ user.userId + " lv " + user.userLv);

        Scanner sc = new Scanner(System.in);
        user.userId = sc.next();
        user.userLv = sc.nextInt();

        System.out.print("user "+ user.userId + " lv " + user.userLv);
    }

}

class User {
    String userId = "codetree";
    Integer userLv = 10;

    // public User(){}

    // public User(String Id, Integer Lv){
    //     this.userId = Id;
    //     this.userLv = Lv;
    // }
}