import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        String[] a = str[0].split("");
        String[] b = str[1].split("");
        
        for (int i = 2; i >= 0; i--) {
            if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                StringBuilder sb = new StringBuilder(str[0]);
                System.out.println(sb.reverse().toString());
                return;
            } else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                StringBuilder sb = new StringBuilder(str[1]);
                System.out.println(sb.reverse().toString());
                return;
            }
        }
    }
}