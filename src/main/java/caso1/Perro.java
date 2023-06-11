package caso1;

import caso1.Animal;

public class Perro extends Animal {
    private String color;


    public Perro(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public void ladrar() {
        System.out.println("woof");
    }


}