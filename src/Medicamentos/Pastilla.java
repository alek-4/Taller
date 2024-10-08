
package Medicamentos;


public class Pastilla {
    
    private String nombre;
    private String fabricante;
    private String admin;

    public Pastilla() {
    }

    public Pastilla(String nombre, String fabricante, String admin) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.admin = admin;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

  
    
    
    public static class Posologia {
        
        private String usuario;
        private Integer dosis;
        private Integer periodo;
        private String reco;

        public Posologia() {
            
        }

        public Posologia(String usuario, Integer dosis, Integer periodo, String reco) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.periodo = periodo;
            this.reco = reco;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public Integer getDosis() {
            return dosis;
        }

        public void setDosis(Integer dosis) {
            this.dosis = dosis;
        }

        public Integer getPeriodo() {
            return periodo;
        }

        public void setPeriodo(Integer periodo) {
            this.periodo = periodo;
        }

        public String getReco() {
            return reco;
        }

        public void setReco(String reco) {
            this.reco = reco;
        }
        
        
       
        }
        
        
        
    }
           
    

