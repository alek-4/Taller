
package Vehiculos;


public class Autos {
     private String marca;
    private String modelo;
    private int motor;
    private int puerta;
    private int asientos;
    private int velocidadm;
    private int velocidada = 0;
    int aceleracion = 20;
    int desaceleracion = 50;
    int velocidadi = 100;
    public Autos() {
    }
    
    
    
    public Autos(String marca, String modelo, int motor, int puerta, int asientos, int velocidadm, int velocidada) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.puerta = puerta;
        this.asientos = asientos;
        this.velocidadm = velocidadm;
        this.velocidada = velocidada;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadm() {
        return velocidadm;
    }

    public void setVelocidadm(int velocidadm) {
        this.velocidadm = velocidadm;
    }

    public int getVelocidada() {
        return velocidada;
    }

    public void setVelocidada(int velocidada) {
        this.velocidada = velocidada;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getDesaceleracion() {
        return desaceleracion;
    }

    public void setDesaceleracion(int desaceleracion) {
        this.desaceleracion = desaceleracion;
    }

    public int getVelocidadi() {
        return velocidadi;
    }

    public void setVelocidadi(int velocidadi) {
        this.velocidadi = velocidadi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", motor=").append(motor);
        sb.append(", puerta=").append(puerta);
        sb.append(", asientos=").append(asientos);
        sb.append(", velocidadm=").append(velocidadm);
        sb.append(", velocidada=").append(velocidada);
        sb.append(", aceleracion=").append(aceleracion);
        sb.append(", desaceleracion=").append(desaceleracion);
        sb.append('}');
        return sb.toString();
    }
   
    
    
}
 


