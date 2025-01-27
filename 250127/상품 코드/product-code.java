import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int code = sc.nextInt();

        Product product = new Product();

        System.out.println("product " + product.code + " is " + product.name);

        product.name = name;
        product.code = code;

        System.out.println("product " + product.code + " is " + product.name);

    }
}

class Product{
    String name = "codetree";
    int code = 50;

    // public Product(String name, int code){
    //     this.name = name;
    //     this.code = code;
    // }
}