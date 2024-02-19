import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int[] minusList = new int[1000001];
        int[] plusList = new int[1000001];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num < 0) minusList[num * -1]++;
            else plusList[num]++;
        }
       
        for (int i = 1000000; i >= 1; i--) {
            if (minusList[i] == 1) sb.append(i * -1).append("\n");
        }
        
        for (int i = 0; i <= 1000000; i++) {
            if (plusList[i] == 1) sb.append(i).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}