import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Integer[] aList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        int M = Integer.parseInt(br.readLine());
        Integer[] bList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        Arrays.sort(aList);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int num = bList[i];
            
            if (binarySearch(num, aList)) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static boolean binarySearch(int n, Integer[] list) {
        int start = 0;
        int end = list.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (list[mid] == n) return true;
            
            if (list[mid] < n) start = mid + 1;
            else end = mid - 1;
        }
        
        return false;
    }
}