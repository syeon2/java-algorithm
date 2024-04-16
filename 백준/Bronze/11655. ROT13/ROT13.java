import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            char[] cList = list[i].toCharArray();

            for (int k = 0; k < cList.length; k++) {
                char changed = (char) (cList[k] + 13);

                if (cList[k] >= 'a' && cList[k] <= 'z' && changed > 'z') {
                    cList[k] = (char) (changed - 'z' + 'a' - 1);
                } else if (cList[k] >= 'A' && cList[k] <= 'Z' && changed > 'Z') {
                    cList[k] = (char) (changed - 'Z' + 'A' - 1);
                } else if (cList[k] >= '0' && cList[k] <= '9') {
                    continue;
                } else {
                        cList[k] = changed;
                    }
                }

            sb.append(String.valueOf(cList)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}