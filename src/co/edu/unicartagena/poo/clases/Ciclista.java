
package co.edu.unicartagena.poo.clases;

import java.util.Objects;
/**
 *
 * @author Carlos
 */
public class Ciclista {
    private final String nombre;
    private final int edad;
    private final String nivel;

    public Ciclista(String nombre, int edad, String nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
    }

    // Getters y Setters (si es necesario)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ciclista ciclista = (Ciclista) obj;
        return edad == ciclista.edad &&
               Objects.equals(nombre, ciclista.nombre) &&
               Objects.equals(nivel, ciclista.nivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nivel);
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     }
