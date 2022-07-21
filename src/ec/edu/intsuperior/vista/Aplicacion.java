/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.util.Scanner;

/**
 *   
 * @author Desiree Bajaña
 */
public class Aplicacion {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Persona perEmp = new Persona();
        Persona perCli = new Persona();
        Cliente cli = new Cliente();
        Directivo dir = new Directivo();
        Empresa emp = new Empresa();

        // 
        String empNombres, dirCartegoria, empreNombre;
        int empEdad, empDias, empHoras;
        String cliNombres, cliTelefono;
        int cliEdad;
        //
        System.out.println("Ingrese los datos de la empresa");
        System.out.println("Nombre de la empresa:");
        empreNombre = leer.next();
        if (empreNombre != null) {
            System.out.println("Ingrese los datos del empleado de la empresa " + empreNombre);
            System.out.println("Nombre:");
            empNombres = leer.next();
            System.out.println("Edad:");
            empEdad = leer.nextInt();
            perEmp.setPerNombre(empNombres);
            
            perEmp.setPerEdad(empEdad);
            System.out.println("Categoria:");
            dirCartegoria = leer.next();
            System.out.println("Dias trabajados:");
            empDias = leer.nextInt();
            System.out.println("Horas trabajados trabajadas en " + empDias + " dias:");
            empHoras = leer.nextInt();
                       
            dir.mostrar(perEmp, empDias, empHoras, dirCartegoria);
       
            //
            System.out.println("Ingrese los datos del cliente que visita " + empreNombre);
            System.out.println("Nombre:");
            cliNombres = leer.next();
            System.out.println("Edad:");
            cliEdad = leer.nextInt();
            System.out.println("Telefono:");
            cliTelefono = leer.next();
            perCli.setPerNombre(cliNombres);
            perCli.setPerEdad(cliEdad);
            
            
            cli.mostrar(perCli, cliTelefono);
            
        } else {
            System.out.println("NO EXISTE LA EMPRESA");
        }
    }

}

        
      
    
