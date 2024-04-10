import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int k = 0; k < 9; k++) {
                board[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        
        int ansMax = 0;
        int ansX = 0;
        int ansY = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if (ansMax < board[i][k]) {
                    ansMax = board[i][k];
                    ansX = k;
                    ansY = i;
                }
            }
        }
        
        bw.write(String.valueOf(ansMax));
        bw.newLine();
        bw.write((ansY + 1) + " " + (ansX + 1));
        
        bw.flush();
        bw.close();
    }
}