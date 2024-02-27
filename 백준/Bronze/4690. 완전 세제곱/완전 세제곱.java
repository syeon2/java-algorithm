import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		for (int i = 2; i <= 100; i++) {

			for (int a = 2; a <= 100; a++) {

				for (int b = a; b <= 100; b++) {

					for (int c = b; c <= 100; c++) {
						int iTri = i * i * i;
						int aTri = a * a * a;
						int bTri = b * b * b;
						int cTri = c * c * c;

						if (iTri == (aTri + bTri + cTri)) {
							sb.append(String.format("Cube = %d, Triple = (%d,%d,%d)", i, a, b, c))
								.append("\n");
						}
					}
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
