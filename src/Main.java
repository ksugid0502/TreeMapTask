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

        Collections.sort(personList, (p1, p2) -> {
            int maxWordsInSurname = 3;

            int person1SurnameWords = getWordsCount(p1.getSurname());
            person1SurnameWords = Math.min(person1SurnameWords, maxWordsInSurname);

            int person2SurnameWords = getWordsCount(p2.getSurname());
            person2SurnameWords = Math.min(person2SurnameWords, maxWordsInSurname);

            if (person1SurnameWords > person2SurnameWords) {
                return 1;
            }
            if (person1SurnameWords < person2SurnameWords) {
                return -1;
            }

            if (p1.getAge() > p2.getAge())
                return 1;
            if (p1.getAge() < p2.getAge())
                return -1;

            return 0;
        });

        for(Person p: personList) {
            System.out.println(p.toString());
        }

    }

    private static int getWordsCount(String str) {
        return str.split("[\\s-]").length;
    }
}