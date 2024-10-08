
package Main;

import Banco.CuentaAhorros;


public class BancoEjecutable {
    public static void main(String[] args) {
        
        CuentaAhorros cuentaA = new CuentaAhorros(100000, 0.10F);
        
        cuentaA.setNcon(50000);
        cuentaA.setNret(70000);
        int trans = 0;
        float inte =cuentaA.setTasa(cuentaA.getTasa()/12);
        
        System.out.println("Su saldo es de: " + cuentaA.getSaldo());
        System.out.println("La tasa de interes es de: " + cuentaA.getTasa());
        
        if (cuentaA.getNcon()> 0){
            System.out.println("La cantidad consignada es de: " + cuentaA.getNcon());
            cuentaA.setSaldo(cuentaA.getNcon()+cuentaA.getSaldo());
          trans = trans + 1;  
        }
        else {
            System.out.println("el valor no es valido");
        }
        System.out.println("cantidad a retirar: " + cuentaA.getNret()); 
        
        if (cuentaA.getNret() < cuentaA.getSaldo()){
            cuentaA.setSaldo(cuentaA.getSaldo()-cuentaA.getNret());
            float interem = cuentaA.getSaldo()*inte;
            System.out.println("el saldo total es: " + (interem+cuentaA.getSaldo()));
            trans = trans+1;
        
        }
        else {
            System.out.println("cantidad insuficiente");
        }
        if (trans > 4){
            cuentaA.setComi((trans-4)*1000);
            System.out.println("La comision mensual es de: " + cuentaA.getComi());
            System.out.println("El numero de transacciones es de: " + trans);
        }
        else {
              System.out.println("La comision mensual es de: " + cuentaA.getComi());
              System.out.println("El numero de transacciones es de: " + trans);
                
        } 
                
                
    }
}
