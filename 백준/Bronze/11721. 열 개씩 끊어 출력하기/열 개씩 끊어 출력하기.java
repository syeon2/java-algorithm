import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i += 10) {
            int start = i;
            int end = Math.min(str.length(), start + 10);
            
            sb.append(str.substring(start, end)).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}