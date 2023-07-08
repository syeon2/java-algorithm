import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 시간복잡도와 풀이 방식을 고민하면서 풀기
        // 시간초를 두고 문제를 이해하면서 풀기

        // Result : A, B, C, D를 구하는 문제
        // How : 문제에서 주어진 연산을 그대로 하면 풀 수 있는 문제

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int caseA = (A + B) % C;
        int caseB = ((A % C) + (B % C)) % C;
        int caseC = (A * B) % C;
        int caseD = ((A % C) * (B % C)) % C;

        bw.write(String.valueOf(caseA));
        bw.newLine();
        bw.write(String.valueOf(caseB));
        bw.newLine();
        bw.write(String.valueOf(caseC));
        bw.newLine();
        bw.write(String.valueOf(caseD));
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
