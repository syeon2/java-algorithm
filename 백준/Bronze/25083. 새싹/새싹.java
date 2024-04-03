import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("         ,r'\"7").append("\n")
            .append("r`-_   ,'  ,/").append("\n")
            .append(" \\. \". L_r'").append("\n")
            .append("   `~\\/").append("\n")
            .append("      |").append("\n")
            .append("      |");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}