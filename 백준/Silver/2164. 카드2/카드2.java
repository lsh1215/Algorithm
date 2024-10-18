import java.util.Queue;
import java.util.LinkedList;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> Q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			Q.offer(i);
		}
		
		
		while(Q.size() > 1) {
			Q.poll();	// 맨 앞의 원소 버림 
			Q.offer(Q.poll());	
		}
		
		System.out.println(Q.poll());	
	}
}