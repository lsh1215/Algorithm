import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for(int i=0; i<n; i++){         
            String name = sc.next();
            String number = sc.next();
            String region = sc.next();

            people[i] = new Person(name, number, region);
        }

        Person latestPerson = people[0];

        for (int i = 1; i < n; i++) {
            if (people[i].name.compareTo(latestPerson.name) > 0) {
                latestPerson = people[i];
            }
        }

        System.out.println("name " + latestPerson.name);
        System.out.println("addr " + latestPerson.street_number);
        System.out.println("city " +latestPerson.region);

    }
}

class Person{
    String name;
    String street_number;
    String region;

    public Person(String name, String number, String region){
        this.name = name;
        this.street_number = number;
        this.region = region;
    }
}