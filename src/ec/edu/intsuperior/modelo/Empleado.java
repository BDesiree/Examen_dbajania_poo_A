package ec.edu.intsuperior.modelo;
// @author Desiree Bajaña

public class Empleado extends Persona {

    double empsueldo_bruto;

    public Empleado() {

    }

    public Empleado(double empsueldo_bruto) {
        this.empsueldo_bruto = empsueldo_bruto;
    }
    public double getEmpsueldo_bruto() {
        return empsueldo_bruto;
    }

    public void setEmpsueldo_bruto(double empsueldo_bruto) {
        this.empsueldo_bruto = empsueldo_bruto;
    }
     public void mostrar(Persona persona, int dias, int horas) {
        System.out.println("Los datos del empleado son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Su sueldo neto es: " + calcular_salario_neto(dias, horas));
    }

    public double calcular_salario_neto(int dias, int horas) {
        int respuesta = dias * horas;
        return respuesta;
    }
   
}
