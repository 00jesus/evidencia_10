package caso1;

import caso1.Animal;

import java.util.ArrayList;

public class Niño extends Persona {
    public ArrayList<Animal> Animales = new ArrayList<Animal>();


    public Niño(String nombre, String rut, int edad, ArrayList<Animal> animales) {
        super(nombre, rut, edad);
        Animales = animales;
    }

    public void irEscuela() {
        throw new UnsupportedOperationException();
    }


}