import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] list = new String[str.length()];

		for (int i = 0; i < list.length; i++) {
			list[i] = str.substring(i);
		}

		Arrays.sort(list);

		Arrays.stream(list).forEach(System.out::println);
    }
}
