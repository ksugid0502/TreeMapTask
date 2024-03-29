import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Anthony", "Steven Evans", 33));
        personList.add(new Person("Nathan", "Stewart", 20));
        personList.add(new Person("Jose", "Jonathan Gonzalez Richardson", 35));
        personList.add(new Person("Anthony", "Dylan Sanders", 41));
        personList.add(new Person("Charles", "Richardson", 25));

        Collections.sort(personList, new PersonComparator(3));

        for(Person p: personList) {
            System.out.println(p.toString());
        }

    }
}