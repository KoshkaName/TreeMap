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

        Collections.sort(people, new PersonsComparator(3));
        System.out.println(people);
    }
}

