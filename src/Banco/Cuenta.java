
package Banco;


public class Cuenta {
    
    private float saldo;
    private Integer ncon;
    private Integer nret;
    private float tasa;
    private float comi;

    public Cuenta(float saldo, float tasa) {
        this.saldo = saldo;
        this.tasa = tasa;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Integer getNcon() {
        return ncon;
    }

    public void setNcon(Integer ncon) {
        this.ncon = ncon;
    }

    public Integer getNret() {
        return nret;
    }

    public void setNret(Integer nret) {
        this.nret = nret;
    }

    public float getTasa() {
        return tasa;
    }

    public float setTasa(float anual) {
        this.tasa = tasa;
       return anual;
    }

    public float getComi() {
        return comi;
    }

    public void setComi(float comi) {
        this.comi = comi;
    }
}

    