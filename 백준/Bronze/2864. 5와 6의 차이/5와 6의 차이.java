import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int minA = getMin(A);
        int minB = getMin(B);
        
        int maxA = getMax(A);
        int maxB = getMax(B);
        
        bw.write((minA + minB) + " " + (maxA + maxB));
        bw.flush();
        bw.close();
    }
    
    public static int getMin(int num) {
        char[] list = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '6') list[i] = '5';
        }
        
        return Integer.parseInt(String.valueOf(list));
    }
    
    public static int getMax(int num) {
        char[] list = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '5') list[i] = '6';
        }
        
        return Integer.parseInt(String.valueOf(list));
    }
}