import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        int hour = Integer.parseInt(list[0]);
        int minute = Integer.parseInt(list[1]);
        
        int addM = Integer.parseInt(br.readLine());
        
        int addedM = minute + addM;
        
        if (addedM >= 60) {
            int hourToM = addedM / 60;
            addedM = addedM % 60;
            
            hour += hourToM;
            hour = hour % 24;
            
            System.out.println(hour + " " + addedM);
        } else {
            System.out.println(hour + " " + addedM);
        }
    }
}