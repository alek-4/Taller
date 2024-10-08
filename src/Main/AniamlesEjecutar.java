
package Main;


import Animales.*;


public class AniamlesEjecutar {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Gatos();
        animal[1] = new Leones();
        animal[2] = new Lobos();
        animal[3] = new Perros();
        
        for (Animal animal1 : animal) {
            System.out.println("Nombre cientifico: " + animal1.getnombre());
            System.out.println("El sonido que emite es: " + animal1.getsonido());
            System.out.println("El alimento que consume es: " + animal1.getalimento());
            System.out.println("Su habitat natural es: " + animal1.gethabitat());
            System.out.println(" ");
        }
            
    }
}
