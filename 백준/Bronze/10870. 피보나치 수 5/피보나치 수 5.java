import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int pprev = 0;
        int prev = 1;
        
        int answer = 0;
        if (N == 0) System.out.println(pprev);
        else if (N == 1) System.out.println(prev);
        else {
            for (int i = 2; i <= N; i++) {
                answer = pprev + prev;
                
                pprev = prev;
                prev = answer;
            }
            
            System.out.println(answer);
        }
    }
}