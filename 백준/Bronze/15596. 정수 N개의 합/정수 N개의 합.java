public class Test {
    long sum(int[] a) {
        long temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }
        
        return temp;
    }
}