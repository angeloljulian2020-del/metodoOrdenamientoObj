import controlles.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] personas = {
            new Person("Diego", 15,new int[]{10, 15, 20}),
            new Person("Juan", 25,new int[]{15, 15, 20}),
            new Person("Maria", 22,new int[]{10, 10, 10}),
            new Person("Ana", 19,new int[]{20, 15, 20}),
            new Person("Carlos", 30,new int[]{20, 10, 20})


        };
        for (Person person : personas) {
            System.out.println(person);

        }
        PersonController pController = new PersonController();
        pController.sortPersonByAge(personas);
        for (Person person : personas) {
            System.out.println(person);

        }
        PersonController controller3 = new PersonController();
        controller3.sortPersonByPromedio(personas);
        System.out.println("Personas ordenadas por promedio de notas:");
        for (Person person : personas) {
            System.out.println(person);

        }
        PersonController controller4 = new PersonController();
        controller4.sortPersonByNameValue(personas);
        System.out.println("Personas ordenadas por valor del nombre:");
        for (Person person : personas) {
            System.out.println(person);
        }
    }
}
