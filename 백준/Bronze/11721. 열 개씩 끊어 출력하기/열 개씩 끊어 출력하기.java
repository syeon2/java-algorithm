import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        while (str.length() >= 10) {
            sb.append(str.substring(0, 10)).append("\n");
            str = str.substring(10);
        }
        
        sb.append(str);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}