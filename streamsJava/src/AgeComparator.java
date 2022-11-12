import model.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person)o2;
        return p1.getAge()>p2.getAge() ? 1 : p2.getAge() >p1.getAge() ? -1 : 0;
    }
}
