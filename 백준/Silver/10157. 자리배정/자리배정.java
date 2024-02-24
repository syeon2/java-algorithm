import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        int N = Integer.parseInt(br.readLine());
        
        boolean[][] isVisit = new boolean[R][C];
        isVisit[R - 1][0] = true;
        
        int curX = 0;
        int curY = R - 1;
        
        int curDirec = 0;
        
        if (C * R < N) bw.write("0");
        else {
            int cnt = 1;
            
            while (cnt != N) {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];
                
                if (isRange(nx, ny, C, R) && !isVisit[ny][nx]) {
                    curX = nx;
                    curY = ny;
                    
                    isVisit[ny][nx] = true;
                    cnt++;
                } else curDirec = turnDirec(curDirec);
            }
            
            int ansX = curX + 1;
            int ansY = R - curY;
            
            bw.write(String.format("%d %d", ansX, ansY));
        }
        
        bw.flush();
        bw.close();
    }
    
    public static boolean isRange(int x, int y, int C, int R) {
        if (x >= 0 && x < C && y >= 0 && y < R) return true;
        
        return false;
    }
    
    public static int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}