import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        if (list[0] == 60 && list[1] == 60 && list[2] == 60) bw.write("Equilateral");
        else if (list[0] + list[1] + list[2] == 180 && (list[0] == list[1]) || (list[1] == list[2] || (list[0] == list[2]))) {
            bw.write("Isosceles");
        } else if (list[0] + list[1] + list[2] == 180 & (list[0] != list[1]) && (list[1] != list[2]) && (list[0] != list[2])) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }

        bw.flush();
        bw.close();
    }
}