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
            

            //metodo ordena las personas segun el promedio de sus notas con seleccion

        public void sortPersonByPromedio(Person[] personas) {
            for (int i = 0; i < personas.length; i++) {
                    int minIndex = i;
                for (int j = i + 1; j < personas.length; j++) {
                    // Comparacion para actualizar el indice(minIndex)
                    if ((personas[j].getPromedio(personas[j].getNotas())) < (personas[minIndex].getPromedio(personas[minIndex].getNotas()))) {
                        minIndex = j;
                    }
                }
                // Pregunto si el Index != de i 
                //entonces cambio
                if(i != minIndex){
                    // Intercambio
                    Person aux = personas[i];
                    personas[i] = personas[minIndex];
                    personas[minIndex] = aux;
                }
            }
        }
        //Ordenar el arreglo de personas por un valor de su nombre
        //el valor del nombre sera la cantidad de letras
        //donde las vocales valen 5
        //consonates valen el valor de la edad
        //ej: Juan 20
            // 20+5+5+20 = 50
        //ej:Ana 80
            //80+5+5 = 90
        public void sortPersonByNameValue(Person[] personas) {
            for (int i = 0; i < personas.length; i++) {
                    int minIndex = i;
                for (int j = i + 1; j < personas.length; j++) {
                    // Comparacion para actualizar el indice(minIndex)
                    if ((personas[j].valueName(personas[j].getName())) < (personas[minIndex].valueName(personas[minIndex].getName()))) {
                        minIndex = j;
                    }
                }
                // Pregunto si el Index != de i 
                //entonces cambio
                if(i != minIndex){
                    // Intercambio
                    Person aux = personas[i];
                    personas[i] = personas[minIndex];
                    personas[minIndex] = aux;
                }
            }
            
        }
    }



    



    


    

