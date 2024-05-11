import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[5][5];
        for (int r = 0; r < 5; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int c = 0; c < 5; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int[] order = new int[25];
        for (int i = 0; i < 25; i += 5) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int k = i; k < i + 5; k++) {
                order[k] = Integer.parseInt(st.nextToken());
            }
        }

        int binggo = 0;
        int idx = 0;

        while (binggo < 3) {
            int xPos = 0;
            int yPos = 0;

            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (order[idx] == board[r][c]) {
                        xPos = c;
                        yPos = r;
                    }
                }
            }

            board[yPos][xPos] = 0;

            boolean isBing1 = true;
            for (int i = 0; i < 5; i++) {
                if (board[yPos][i] != 0) isBing1 = false;
            }

            boolean isBing2 = true;
            for (int i = 0; i < 5; i++) {
                if (board[i][xPos] != 0) isBing2 = false;
            }

            boolean isBing3 = true;
            if (xPos == yPos) {
                for (int i = 0; i < 5; i++) {
                    if (board[i][i] != 0) isBing3 = false;
                }
            } else isBing3 = false;

            boolean isBing4 = true;
            if (4 - yPos == xPos) {
                for (int i = 0; i < 5; i++) {
                    if (board[4 - i][i] != 0) isBing4 = false;
                }
            } else isBing4 = false;

            if (isBing1) binggo++;
            if (isBing2) binggo++;
            if (isBing3) binggo++;
            if (isBing4) binggo++;

            idx++;
        }

        bw.write(String.valueOf(idx));
        bw.flush();
        bw.close();
    }
}