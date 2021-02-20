package Lambda表达式.练习.有参数无返回值;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("12", 24),
                new Person("1", 26),
                new Person("13", 28)
        };

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        Arrays.sort(arr, Comparator.comparingInt(Person::getAge));

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
