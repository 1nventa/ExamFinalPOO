/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.clases;

import java.util.HashSet;

/**
 *
 * @author Carlos
 */
public class GestorBicicleta {
     private final HashSet<Bicicleta> listaBicicletas;

    // Constructor
    public GestorBicicleta() {
        listaBicicletas = new HashSet<>();
    }

    // Métodos
    public boolean existeBicicleta(Bicicleta bicicleta) {
        return listaBicicletas.contains(bicicleta);
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        listaBicicletas.add(bicicleta);
    }

    public Bicicleta buscarBicicletaPorMarca(String marca) {
        for (Bicicleta bicicleta : listaBicicletas) {
            if (bicicleta.getMarca().equalsIgnoreCase(marca)) {
                return bicicleta;
            }
        }
        return null;
    }

    public boolean eliminarBicicleta(String marca) {
        Bicicleta bicicleta = buscarBicicletaPorMarca(marca);
        if (bicicleta != null) {
            return listaBicicletas.remove(bicicleta);
        }
        return false;
    }
}
