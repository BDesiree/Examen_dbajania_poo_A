package ec.edu.intsuperior.modelo;
// @author Desiree Bajaña

public class Directivo extends Empleado {

    String diocategoria;
    public Directivo() {
    }
    
    public Directivo(String diocategoria) {
        this.diocategoria = diocategoria;
    }
      
    
    public String getDiocategoria() {
        return diocategoria;
    }

    public void setDiocategoria(String diocategoria) {
        this.diocategoria = diocategoria;
    }

     public void mostrar(Persona persona, int dias, int horas, String dirCategoria) {
        System.out.println("Los datos del empleado son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Categoria: " + dirCategoria);
        System.out.println("Su sueldo neto es: " + calcular_salario_neto(dias, horas));
    }


}

