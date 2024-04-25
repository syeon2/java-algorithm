import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u' ||
                str.charAt(i) == 'i') ans++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}