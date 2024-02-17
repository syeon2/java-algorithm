import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[7];
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            list[num]++;
        }
        
        int max = 0;
        int cnt = 0;
        int dice = 0;
        
        for (int i = 1; i < list.length; i++) {
            if (list[i] == 2 || list[i] == 3) {
                dice = i;
                cnt = list[i];
                break;
            } else if (list[i] == 1) max = i;
        }
        
        int ans = 0;
        if (cnt == 3) ans = 10000 + (dice * 1000);
        else if (cnt == 2) ans = 1000 + (dice * 100);
        else ans = max * 100;
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}