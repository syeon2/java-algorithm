import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Person[] list = new Person[N];
        for (int n = 0; n < N; n++) {
            int age = sc.nextInt();
            String name = sc.next();
            int idx = n;
            
            list[n] = new Person(age, name, idx);
        }
        
        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                if (a.age == b.age) {
                    return a.idx - b.idx;
                }
                
                return a.age - b.age;
            }
        });
        
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d %s\n", list[i].age, list[i].name);
        }
    }
    
    public static class Person {
        public int age;
        public String name;
        public int idx;
        
        public Person(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }
}