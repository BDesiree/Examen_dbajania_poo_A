package ec.edu.intsuperior.modelo;

// @author Desiree Bajaña

public class Cliente extends Persona {

    String cliTelefono;
    
    public Cliente(){
    
    }

    public Cliente(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    
     public void mostrar(Persona persona, String cliTelefono) {
        System.out.println("Los datos del cliente son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Telefono: " + cliTelefono);
     }
}
    