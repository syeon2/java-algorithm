import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
       
        char[] list = String.valueOf(a * b * c).toCharArray();
        
        int[] ans = new int[10];
        for (int i = 0; i < list.length; i++) {
            int idx = list[i] - '0';
            
            ans[idx]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            sb.append(ans[i]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}