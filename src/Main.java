import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Милина", "Якименко", 12));
        people.add(new Person("Ольга", "Векю", 16));
        people.add(new Person("Олеся", "Галлямова Якименко", 20));
        people.add(new Person("Алексей", "Серый Волк Пушистый", 19));
        people.add(new Person("Юрий", "Серый Якименко", 39));

        Collections.sort(people, new PersonsComparator(3));
        System.out.println(people);

        Predicate<Person> years18 = (person) -> (person.getAge() < 18);
        people.removeIf(years18);
        System.out.println("Люди младше 18 лет удалены, остались старше 18: " + people);
    }
}

