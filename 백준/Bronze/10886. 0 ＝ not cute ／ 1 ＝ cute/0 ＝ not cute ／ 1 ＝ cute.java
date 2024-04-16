import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int cute = 0;
        int ugly = 0;
        
        for (int n = 0; n < N; n++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 1) cute++;
            else ugly++;
        }
        
        if (cute > ugly) bw.write("Junhee is cute!");
        else bw.write("Junhee is not cute!");
        
        bw.flush();
        bw.close();
    }
}