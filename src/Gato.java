public class Gato {
    private String sonido;

    private String raza;

    private Gato(String sonido, String raza){
        this.sonido = sonido;
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
}
