import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Милина", "Якименко", 12));
        people.add(new Person("Олеся", "Галлямова Якименко", 20));
        people.add(new Person("Алексей", "Серый Волк Пушистый", 19));
        people.add(new Person("Юрий", "Серый Якименко", 39));

        final int max = 3;
        people.sort((o1, o2) -> {
            int len1 = o1.getSurname().split(" ").length;
            int len2 = o2.getSurname().split(" ").length;
            if (Math.min(len1, max) != Math.min(len2, max)) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(people);
    }
}

