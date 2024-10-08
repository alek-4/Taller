
package Animales;


public class Perros extends Caninos{
    
    @Override
    public String getnombre() {
       return "Doge";
    }

    @Override
    public String getsonido() {
        return "Woof";
    }

    @Override
    public String getalimento() {
        return "Carne"; 
    }

    @Override
    public String gethabitat() {
        return "casas, calles"; 
    }
}
