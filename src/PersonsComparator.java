import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    protected int max;

    public PersonsComparator(int max) {
        this.max = max;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int len1 = o1.getSurname().split(" ").length;
        int len2 = o2.getSurname().split(" ").length;
        if (Math.min(len1, max) != Math.min(len2, max)) {
            return Integer.compare(len1, len2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
