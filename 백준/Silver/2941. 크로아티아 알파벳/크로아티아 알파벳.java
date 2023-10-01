import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int count = 0;

		while (str.contains("c=")) {
			str = str.replaceFirst("c=", "/");
			count++;
		}

		while (str.contains("c-")) {
			str = str.replaceFirst("c-", "/");
			count++;
		}

		while (str.contains("dz=")) {
			str = str.replaceFirst("dz=", "/");
			count++;
		}

		while (str.contains("d-")) {
			str = str.replaceFirst("d-", "/");
			count++;
		}

		while (str.contains("lj")) {
			str = str.replaceFirst("lj", "/");
			count++;
		}

		while (str.contains("nj")) {
			str = str.replaceFirst("nj", "/");
			count++;
		}

		while (str.contains("s=")) {
			str = str.replaceFirst("s=", "/");
			count++;
		}

		while (str.contains("z=")) {
			str = str.replaceFirst("z=", "/");
			count++;
		}

		str = str.replaceAll("/", "");
		count += str.length();

		System.out.println(count);
	}
}
