
package Main;

import Medicamentos.Pastilla;



public class MedicamentoEjecutable {
    
    public static void main(String[] args) {
        
         Pastilla pastilla = new Pastilla("Paracetamol", "Gabriel", "Oral");
        
         Pastilla.Posologia posologia = new Pastilla.Posologia("niños", 500, 2, "Evitar sentarse despues de usarlo" );
         
        System.out.println("Nombre del medicamento: " + pastilla.getNombre());
        System.out.println("Fabricante del medicamento: " + pastilla.getFabricante());
        System.out.println("Via de administracion: " + pastilla.getAdmin());
        System.out.println("Usuarios: " + posologia.getUsuario() );
        System.out.println("Dosis: " + posologia.getDosis() + " ml");
        System.out.println("Periodo: " + posologia.getPeriodo() + " horas");
        System.out.println("Recomendaciones: " + posologia.getReco());
        
    }
}
