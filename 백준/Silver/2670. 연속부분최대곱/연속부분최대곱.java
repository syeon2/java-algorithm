import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        double[] list = new double[N];
        for (int i = 0; i < N; i++) {
            list[i] = Double.parseDouble(br.readLine());
        }
        
        double ans = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if (list[i] * list[i + 1] > list[i + 1]) list[i + 1] = list[i] * list[i + 1];
        }
        
        for (int i = 0; i < N; i++) {
            if (ans < list[i]) ans = list[i];
        }
        
        bw.write(String.format("%.3f", ans));
        bw.flush();
        bw.close();
    }
}