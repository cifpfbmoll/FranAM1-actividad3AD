public class Perro {
    
    // Atributos
    private String raza;
    private String sonido;

    // Constructores
    public Perro() {}

    public Perro(String raza, String sonido) {
        this.raza = raza;
        this.sonido = sonido;
    }

    // Getters & Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

}
