
package Banco;


public class CuentaCorriente extends Cuenta{
   
    private float sobregiro;
   
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
    
}
