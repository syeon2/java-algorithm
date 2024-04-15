import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        sb.append(".  .   .").append("\n")
            .append("|  | _ | _. _ ._ _  _").append("\n")
            .append("|/\\|(/.|(_.(_)[ | )(/.");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}