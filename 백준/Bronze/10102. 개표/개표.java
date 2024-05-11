import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'A') a++;
            else b++;
        }
        
        if (a > b) bw.write("A");
        else if (b > a) bw.write("B");
        else bw.write("Tie");
        
        bw.flush();
        bw.close();
    }
}