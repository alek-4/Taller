
package Banco;


public class CuentaAhorros extends Cuenta {
    
    private Boolean activo;
    
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
}
