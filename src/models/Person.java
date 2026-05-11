package models;

public class Person {
    private String name;
    private int age;
    private int[] notas;

    public Person(String name, int age,int[] notas) {
        this.name = name;
        this.age = age;
        this.notas =notas; 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Persona " + "name=" + name + ", age=" + age + "Promedio=" + getPromedio(notas);
    }

    public int[] getNotas() {
        return notas;
    }
    
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio(int[] notas){
        //calcular promedio
        //(sumo todas laas notas)/cantidad de notas
        
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma/notas.length;
    }
    public int valueName(String name){
        //calcular el valor del nombre
        //cantidad de letras donde las vocales valen 5
        int value = 0;
        for (int i = 0; i < name.length(); i++) {
            char letra = name.charAt(i);
            //letra eres vocal ?
            //verdader sumo +5
            //eres consonante ? sumo el valor de la edad 
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                value += 5;
            } else {
                value += age;
            }
        }
        return value;
    }
}
