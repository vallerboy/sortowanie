import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", "Polak", 30));
        personList.add(new Person("Adam", "Trybancki", 70));
        personList.add(new Person("Karol", "Nowak", 54));
        personList.add(new Person("Damian", "Góra", 93));
        personList.add(new Person("Wiktor", "Nowicki", 23));

        List<String> stringList = new ArrayList<>();
        stringList.add("Aasda");
        stringList.add("Tomek");
        stringList.add("Ada");
        stringList.add("Filemon");

        Collections.sort(personList);

        for(Person person : personList) {
           System.out.println(person.toString());
        }



    }
}
