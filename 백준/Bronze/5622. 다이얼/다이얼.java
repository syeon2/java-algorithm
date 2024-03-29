import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] list = br.readLine().toCharArray();
        
        int ans = 0;
        
        for (int i = 0; i < list.length; i++) {
            ans += getSecond(list[i]);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static int getSecond(char c) {
        if (c <= 'C') return 3;
        else if (c <= 'F') return 4;
        else if (c <= 'I') return 5;
        else if (c <= 'L') return 6;
        else if (c <= 'O') return 7;
        else if (c <= 'S') return 8;
        else if (c <= 'V') return 9;
        else return 10;
    }
}