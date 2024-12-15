
package co.edu.unicartagena.poo.clases;


import java.util.HashSet;

/**
 *
 * @author Carlos
 */
public class GestorCiclistas {
     private final HashSet<Ciclista> listaCiclistas; 

    public GestorCiclistas() {
        this.listaCiclistas = new HashSet<>();
    }

   
    public boolean existeCiclista(Ciclista ciclista) {
        return listaCiclistas.contains(ciclista);
    }

   
    public void agregarCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }
}
