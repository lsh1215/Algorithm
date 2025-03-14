import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] names = new String[n];

        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();

            students[i] = new Student(names[i], korean[i], english[i], math[i]);
            
        }

        Arrays.sort(students);
        for(int i = 0; i < n; i++)
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
    
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if (this.kor != student.kor) {
            return student.kor - this.kor; // 국어 점수 내림차순
        }
        if (this.eng != student.eng) {
            return student.eng - this.eng; // 영어 점수 오름차순
        }
        return student.math - this.math; // 수학 점수 내림차순
    }
}