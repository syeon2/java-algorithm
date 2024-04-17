import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split("-");
        
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str.charAt(0));
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}