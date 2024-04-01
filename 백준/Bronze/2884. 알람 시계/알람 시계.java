import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int h = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);
        
        if (m < 45) {
            if (h == 0) h = 23;
            else h--;
            
            m = 60 - (45 - m);
        } else m -= 45;
        
        bw.write(String.valueOf(h));
        bw.write(" ");
        bw.write(String.valueOf(m));
        
        bw.flush();
        bw.close();
    }
}