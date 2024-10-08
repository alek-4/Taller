
package Main;

import Objetos.Planetas;
import Objetos.TiposDePlaneta;

public class PlanetasEjecutar {
    public static void main(String[] args) {
        
        Planetas Tierra = new Planetas("Tierra", 1, 5.9736E24, 1.08321E12, 149597871, true );
        
        System.out.println("Nombre del planeta = " + Tierra.getNombre() );
        System.out.println("La cantidad de satiles es de = " + Tierra.getSatelites());
        System.out.println("La masa del planeta es de = " + Tierra.getMasa());
        System.out.println("El volumen del planeta es de = " + Tierra.getVolumen());
        System.out.println("La distancia del planeta es de = " + Tierra.getDistancia());
        System.out.println("El planeta es observable? = " + Tierra.getObservable());
        Tierra.setDensidad(Tierra.getMasa()/Tierra.getVolumen());
        Tierra.setDiametro((int)Math.pow(3*Tierra.getVolumen()/(4*Math.PI),1.0/3)*2);
        System.out.println("La Densidad de la " + Tierra.getNombre() + " es de " + Tierra.getDensidad());
        System.out.println("El diametro es de " + Tierra.getDiametro());
        if (Tierra.getDiametro()<= Tierra.getTerrestre() && Tierra.getDiametro() >= Tierra.getEnano()) {
            System.out.println("Tipo de planeta = " + TiposDePlaneta.Terrestre);
        }
        else {
            if (Tierra.getDiametro() <= Tierra.getEnano()) 
                System.out.println("Tipo de planeta = " + TiposDePlaneta.Enano);
            else {
                System.out.println("Tipo de planeta = " + TiposDePlaneta.Gaseoso);
            }
        }
        Tierra.setUbicacion(Tierra.getDistancia() >= Tierra.getUA());
        System.out.println("El planeta es exterior = " + Tierra.getUbicacion());
        
        System.out.println(" ");
        
         Planetas Jupiter = new Planetas("Jupiter", 79, 1.899E27, 1.4313E15, 750000000, true );
        
        System.out.println("Nombre del planeta = " + Jupiter.getNombre() );
        System.out.println("La cantidad de satiles es de = " + Jupiter.getSatelites());
        System.out.println("La masa del planeta es de = " + Jupiter.getMasa());
        System.out.println("El volumen del planeta es de = " + Jupiter.getVolumen());
        System.out.println("La distancia del planeta es de = " + Jupiter.getDistancia());
        System.out.println("El planeta es observable? = " + Jupiter.getObservable());
        Jupiter.setDensidad(Jupiter.getMasa()/Jupiter.getVolumen());
        Jupiter.setDiametro((int)Math.pow(3*Jupiter.getVolumen()/(4*Math.PI),1.0/3)*2);
        System.out.println("La Densidad de la " + Jupiter.getNombre() + " es de " + Jupiter.getDensidad());
        System.out.println("El diametro es de " + Jupiter.getDiametro());
        if (Jupiter.getDiametro()<= Jupiter.getTerrestre() && Jupiter.getDiametro() >= Jupiter.getEnano()) {
            System.out.println("Tipo de planeta = " + TiposDePlaneta.Terrestre);
        }
        else {
            if (Jupiter.getDiametro() <= Jupiter.getEnano()) 
                System.out.println("Tipo de planeta = " + TiposDePlaneta.Enano);
            else {
                System.out.println("Tipo de planeta = " + TiposDePlaneta.Gaseoso);
            }
        }
        Jupiter.setUbicacion(Jupiter.getDistancia() >= Jupiter.getUA());
        System.out.println("El planeta es exterior = " + Jupiter.getUbicacion());
    }
    
}
