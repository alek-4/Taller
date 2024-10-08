
package Animales;


public class Lobos extends Caninos{
    
    @Override
    public String getnombre() {
       return "Fenrir";
    }

    @Override
    public String getsonido() {
        return "AUUUUUUUUUUUUUU";
    }

    @Override
    public String getalimento() {
        return "Huesos,carne"; 
    }

    @Override
    public String gethabitat() {
        return "bosques"; 
    }
}
