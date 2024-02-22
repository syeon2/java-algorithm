import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            Arrays.sort(list);
            
            if (list[0] == 0 && list[1] == 0 && list[2] == 0) break;
            
            if ((list[2] * list[2]) == (list[1] * list[1]) + (list[0] * list[0])) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}