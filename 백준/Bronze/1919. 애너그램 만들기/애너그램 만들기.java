import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list1 = br.readLine().toCharArray();
        char[] list2 = br.readLine().toCharArray();

        for (int i = 0; i < list1.length; i++) {

            for (int k = 0; k < list2.length; k++) {
                if (list1[i] == list2[k]) {
                    list1[i] = 0;
                    list2[k] = 0;

                    break;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != 0) ans++;
        }

        for (int i = 0; i < list2.length; i++) {
            if (list2[i] != 0) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}