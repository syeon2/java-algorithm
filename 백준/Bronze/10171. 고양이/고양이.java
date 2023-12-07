import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		sb.append("\\    /\\").append("\n")
			.append(" )  ( ')").append("\n")
			.append("(  /  )").append("\n")
			.append(" \\(__)|");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
