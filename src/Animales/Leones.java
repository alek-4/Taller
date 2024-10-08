
package Animales;


public class Leones extends Felinos{
    
    @Override
    public String getnombre() {
       return "Simba";
    }

    @Override
    public String getsonido() {
        return "Roar";
    }

    @Override
    public String getalimento() {
        return "carne"; 
    }

    @Override
    public String gethabitat() {
        return "savana"; 
    }
    
}
