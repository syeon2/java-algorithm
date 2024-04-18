import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String str = br.readLine();
            
            if (str.equals("#")) break;
            
            int ans = 0;
            
            for (int i = 0; i < str.length(); i++) {
                if (isVowel(str.charAt(i))) ans++;
            }
            
            sb.append(ans).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
        
        return false;
    }
}