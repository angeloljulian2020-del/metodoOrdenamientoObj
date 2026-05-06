package controlles;

import models.Person;

public class PersonController {

    
        //Metdo que ordena un arreglo de perdona
        //por su EDAD age, con metodo de insercion
        public void sortPersonByAge(Person[] personas) {
            for (int i = 1; i < personas.length; i++) {
                Person aux = personas[i];
                int j = i - 1;
                while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                    personas[j + 1] = personas[j];
                    j--;
                    // o j = j - 1;
                }
                personas[j + 1] = aux;
            }

        public void sortPersonByName(Person[] personas) {
            for (int i = 1; i < personas.length; i++) {
                Person aux = personas[i];
                int j = i - 1;
                while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                    personas[j + 1] = personas[j];
                    j--;
                    // o j = j - 1;
                }
                personas[j + 1] = aux;
            }



    }


    
}
