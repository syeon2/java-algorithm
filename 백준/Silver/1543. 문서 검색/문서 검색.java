import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int ans = 0;
        int idx = 0;
        while (idx < str1.length()) {
            if (idx + str2.length() > str1.length()) break;

            boolean isSame = true;
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i + idx) != str2.charAt(i)) isSame = false;
            }

            if (isSame) {
                ans++;
                idx += str2.length();
            } else idx++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}