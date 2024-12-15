
package co.edu.unicartagena.poo.clases;

import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Bicicleta {
    
    private String marca;
    private String tipo;
    private String material;

    // Constructor
    public Bicicleta(String marca, String tipo, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Sobrescribir equals y hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) obj;
        return marca.equalsIgnoreCase(bicicleta.marca) &&
               tipo.equalsIgnoreCase(bicicleta.tipo) &&
               material.equalsIgnoreCase(bicicleta.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca.toLowerCase(), tipo.toLowerCase(), material.toLowerCase());
    }

    // Método para mostrar los datos como texto
    @Override
    public String toString() {
        return "Marca: " + marca + ", Tipo: " + tipo + ", Material: " + material;
    }
    }
    


