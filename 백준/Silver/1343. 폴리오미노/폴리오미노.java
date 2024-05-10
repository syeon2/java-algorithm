import java.io.*;

public class Main {

    public static String A = "AAAA";
    public static String B = "BB";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        str = str.replaceAll("XXXX", A);
        str = str.replaceAll("XX", B);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') str = "-1";
        }

        System.out.println(str);
    }
}