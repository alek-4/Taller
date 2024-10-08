
package Objetos;


public class Planetas {
    
    private String nombre;
    private Integer satelites;
    private Double masa;
    private Double volumen;
    private Integer distancia;
    private Boolean observable;
    private Double densidad;
    private Integer diametro;
    private Boolean ubicacion;
    int Terrestre = 15000;
    int Gaseoso = 50000;
    int Enano = 2400;
    double UA = 2.1*149597871;
            
    public Planetas() {
    }

    public Planetas(String nombre, Integer satelites, Double masa, Double volumen, Integer distancia, Boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.distancia = distancia;
        this.observable = observable;
        
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSatelites() {
        return satelites;
    }

    public void setSatelites(Integer satelites) {
        this.satelites = satelites;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Boolean getObservable() {
        return observable;
    }

    public void setObservable(Boolean observable) {
        this.observable = observable;
    }

    public Double getDensidad() {
        return densidad;
    }

    public void setDensidad(Double densidad) {
        this.densidad = densidad;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Boolean getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Boolean ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTerrestre() {
        return Terrestre;
    }

    public void setTerrestre(int Terrestre) {
        this.Terrestre = Terrestre;
    }

    public int getGaseoso() {
        return Gaseoso;
    }

    public void setGaseoso(int Gaseoso) {
        this.Gaseoso = Gaseoso;
    }

    public int getEnano() {
        return Enano;
    }

    public void setEnano(int Enano) {
        this.Enano = Enano;
    }

    public double getUA() {
        return UA;
    }

    public void setUA(double UA) {
        this.UA = UA;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planetas{");
        sb.append("nombre=").append(nombre);
        sb.append(", satelites=").append(satelites);
        sb.append(", masa=").append(masa);
        sb.append(", volumen=").append(volumen);
        sb.append(", distancia=").append(distancia);
        sb.append(", observable=").append(observable);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
