import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        String str;
        
        while ((str = br.readLine()) != null) {
            String[] sentence = str.split(" ");
            
            if (sentence.length == 1) continue;
            
            int num = Integer.parseInt(sentence[0]);
            
            String[] list = sentence[1].split("");
            for (int i = 0; i < list.length; i++) {
                for (int k = 0; k < num; k++) {
                    sb.append(list[i]);
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}