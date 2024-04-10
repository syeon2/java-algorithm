import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int[] list = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            
            list[idx]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(list[i]).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}