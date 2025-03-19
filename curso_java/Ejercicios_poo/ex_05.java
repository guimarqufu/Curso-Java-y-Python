package Ejercicios_poo;

abstract class Animal {
    public abstract void hacerSonido();

    public void soy(){
        System.out.println("Soy Animal");
    }
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

class Persa extends Gato {
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Soy un gato persa");
/*         Animal animal = new Animal(); // No puedo acceder al padre del padre
        animal.soy(); */
    }
}
public class ex_05 {
    public static void main(String[] args) {
        Persa mipersa = new Persa();
        mipersa.hacerSonido();
    }
}
