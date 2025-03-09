import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] persons = new Person[n];
        for(int i=0; i<n; i++){
            String name = sc.next();
            int tall = sc.nextInt();
            int weight = sc.nextInt();

            persons[i] = new Person(name, tall, weight);
        }

        Arrays.sort(persons);
        for(int i = 0; i < n; i++){
            System.out.println(persons[i].name + " " + persons[i].tall + " " + persons[i].weight);
        }   
    }
}

class Person implements Comparable<Person>{
    String name;
    int tall;
    int weight;

    public Person(String name, int tall, int weight){
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        return this.tall - person.tall;
    }
}

