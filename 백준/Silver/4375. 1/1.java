import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;

		while ((str = br.readLine()) != null) {
			int n = Integer.parseInt(str);

			int num = 1;
			int current = 1;

			while (num % n != 0) {
				num = (num * 10 + 1) % n;
				current += 1;
			}
			
			bw.write(String.valueOf(current));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
