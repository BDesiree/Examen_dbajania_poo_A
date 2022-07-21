package ec.edu.intsuperior.modelo;

/**
 *
 * @author Desiree Bajaña
 */
public class Persona {
    private String perNombre;
    
    private int perEdad;
    
    public Persona(){
    
    }

    public Persona(String perNombre, int perEdad) {
        this.perNombre = perNombre;
        this.perEdad = perEdad;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public int getPerEdad() {
        return perEdad;
    }

    public void setPerEdad(int perEdad) {
        this.perEdad = perEdad;
    }
    
}