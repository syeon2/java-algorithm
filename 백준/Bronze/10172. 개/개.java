import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		sb.append("|\\_/|").append("\n")
			.append("|q p|   /}").append("\n")
			.append("( 0 )\"\"\"\\").append("\n")
			.append("|\"^\"`    |").append("\n")
			.append("||_/=\\\\__|");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
