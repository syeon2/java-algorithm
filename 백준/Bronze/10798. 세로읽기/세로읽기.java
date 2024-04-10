import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] list = new char[5][16];
        
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            
            for (int k = 0; k < str.length(); k++) {
                list[i][k] = str.charAt(k);
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            for (int k = 0; k < 5; k++) {
                if (list[k][i] != 0) {
                    sb.append(list[k][i]);
                }
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}