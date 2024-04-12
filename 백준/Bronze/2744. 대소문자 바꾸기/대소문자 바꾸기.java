import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] list = br.readLine().toCharArray();
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 'a' && list[i] <= 'z') {
                list[i] = (char) (list[i] - 'a' + 'A');
            } else {
                list[i] = (char) (list[i] - 'A' + 'a');
            }
        }
        
        bw.write(String.valueOf(list));
        bw.flush();
        bw.close();
    }
}