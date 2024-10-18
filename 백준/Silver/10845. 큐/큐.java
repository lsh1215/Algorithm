import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> Q = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine()); // 명령어 개수 입력
        
        while (n-- > 0) {
            String q = br.readLine();
            
            if (q.startsWith("push")) {
                int val = Integer.parseInt(q.split(" ")[1]);
                Q.add(val);
            } 
            else if (q.equals("pop")) {
                if (Q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Q.poll() + "\n");
                }
            } 
            else if (q.equals("size")) {
                bw.write(Q.size() + "\n");
            } 
            else if (q.equals("empty")) {
                bw.write((Q.isEmpty() ? 1 : 0) + "\n");
            } 
            else if (q.equals("front")) {
                if (Q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Q.peek() + "\n");
                }
            } 
            else if (q.equals("back")) {
                if (Q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(((LinkedList<Integer>) Q).getLast() + "\n");
                }
            }
        }
        bw.flush(); // 출력 버퍼를 비워줌
        bw.close(); // BufferedWriter 닫기
    }
}
