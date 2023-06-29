import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		while(s != null) {
			int sch = 0;
			int bch = 0;
			int num = 0;
			int blank = 0;

			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') sch++;
				else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') bch++;
				else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') num++;
				else blank++;
			}

			System.out.printf("%d %d %d %d\n", sch, bch, num, blank);
			s = br.readLine();
		}
	}
}
