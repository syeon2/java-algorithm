import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().trim().split(" ");
        
        if (list[0].equals("")) bw.write("0");
        else bw.write(String.valueOf(list.length));
        bw.flush();
        bw.close();
    }
}