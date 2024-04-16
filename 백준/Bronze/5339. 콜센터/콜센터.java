import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        sb.append("     /~\\").append("\n")
            .append("    ( oo|").append("\n")
            .append("    _\\=/_").append("\n")
            .append("   /  _  \\").append("\n")
            .append("  //|/.\\|\\\\").append("\n")
            .append(" ||  \\ /  ||").append("\n")
            .append("============").append("\n")
            .append("|          |").append("\n")
            .append("|          |").append("\n")
            .append("|          |");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}