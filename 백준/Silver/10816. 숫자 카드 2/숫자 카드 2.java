import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] aList = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aList[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine());
        int[] bList = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bList[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(aList);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int start = lowerBound(bList[i], aList);
            int end = upperBound(bList[i], aList);
            
            sb.append(end - start).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int upperBound(int value, int[] list) {
        int start = 0;
        int end = list.length - 1;
        
        int minIdx = list.length;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (list[mid] > value) {
                end = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                start = mid + 1;
            }
        }
        
        return minIdx;
    }
    
    public static int lowerBound(int value, int[] list) {
        int start = 0;
        int end = list.length - 1;
        
        int minIdx = list.length;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (list[mid] >= value) {
                end = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                start = mid + 1;
            }
        }
        
        return minIdx;
    }
}