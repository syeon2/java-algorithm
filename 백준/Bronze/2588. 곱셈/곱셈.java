import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        int bFirst = B % 10;
        int bSecond = (B / 10) % 10;
        int bThird = B / 100;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(bFirst * A).append("\n")
            .append(bSecond * A).append("\n")
            .append(bThird * A).append("\n")
            .append(A * B);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}