import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] plusList = new int[10000001];
        int[] minusList = new int[10000001];

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(nums[i]);

            if (num >= 0) plusList[num]++;
            else minusList[num * -1]++;
        }

        N = Integer.parseInt(br.readLine());
        nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(nums[i]);

            if (num >= 0 && plusList[num] > 0) sb.append(1).append(" ");
            else if (num < 0 && minusList[num * -1] > 0) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}