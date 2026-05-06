import controlles.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] personas = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("william", 19),
            new Person("Marco", 40)


        };
        for (Person person : personas) {
            System.out.println(person);

        }
        PersonController pController = new PersonController();
        pController.sortPersonByAge(personas);
        for (Person person : personas) {
            System.out.println(person);

        }
    }
}
