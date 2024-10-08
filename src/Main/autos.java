
package Main;


import Vehiculos.Autos;

public class autos {
    public static void main(String[] args) {
        Autos bocho = new Autos("Bugatti", "123", 6, 4, 4, 250, 0);
        int ace = bocho.getVelocidada() +(bocho.getAceleracion()+ bocho.getVelocidadi());
        System.out.println("la marcha del auto es = " + bocho.getMarca());
        System.out.println("el modelo es = " + bocho.getModelo());
        System.out.println("el motor es = " + bocho.getMotor());
        System.out.println("la cantidad de puertas es de " + bocho.getPuerta());
        System.out.println("la cantidad de asientos es de " + bocho.getAsientos());
        System.out.println("la velocidad maxima es de = " + bocho.getVelocidadm());
        System.out.println("la velocidad minima es de = " + bocho.getVelocidada());
        while (ace < bocho.getVelocidadm()) {
            if (ace < 0 ) {
                ace = 0 ;
                System.out.println("velocidad actual =" + bocho.getVelocidada());
                System.out.println("no se puede deshacelerar en negativo");
                break;
                
            }
            
            else {
                System.out.println("velocidad actual =" + ace);
                ace = ace-bocho.getDesaceleracion();
                
            }
               
        }
    }
    
}
