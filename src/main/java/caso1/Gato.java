package caso1;

import caso1.Animal;

public class Gato extends Animal {


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void morder() {
        throw new UnsupportedOperationException();
    }

    public void rasgunar() {
        throw new UnsupportedOperationException();
    }


}