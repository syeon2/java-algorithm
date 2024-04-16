import java.io.*;

public class Main {
    
    public static String[] list = {"000", "001", "010", "011", "100", "101", "110", "111"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';
            
            if (i == 0) sb.append(Integer.parseInt(list[idx]));
            else sb.append(list[idx]);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}