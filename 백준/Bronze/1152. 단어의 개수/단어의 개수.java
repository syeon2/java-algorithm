import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().trim().split(" ");
       
        int ans = 0;
        
        if (!list[0].equals("")) ans = list.length;
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}