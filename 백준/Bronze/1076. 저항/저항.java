import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        
        long value = ((10 * getValue(first)) + getValue(second)) * multiply(third);
        
        bw.write(String.valueOf(value));
        bw.flush();
        bw.close();
    }
    
    public static long multiply(String color) {
        if (color.equals("black")) return 1;
        else if (color.equals("brown")) return 10;
        else if (color.equals("red")) return 100;
        else if (color.equals("orange")) return 1000;
        else if (color.equals("yellow")) return 10000;
        else if (color.equals("green")) return 100000;
        else if (color.equals("blue")) return 1000000;
        else if (color.equals("violet")) return 10000000;
        else if (color.equals("grey")) return 100000000;
        else return 1000000000;
    }
    
    public static long getValue(String color) {
        if (color.equals("black")) return 0;
        else if (color.equals("brown")) return 1;
        else if (color.equals("red")) return 2;
        else if (color.equals("orange")) return 3;
        else if (color.equals("yellow")) return 4;
        else if (color.equals("green")) return 5;
        else if (color.equals("blue")) return 6;
        else if (color.equals("violet")) return 7;
        else if (color.equals("grey")) return 8;
        else return 9;
    }
}