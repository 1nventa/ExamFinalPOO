
package co.edu.unicartagena.poo.clases;

import java.util.HashSet;

/**
 *
 * @author Carlos
 */
public class GestorCompetencia {
    private final HashSet<Competencia> listaCompetencias;

    public GestorCompetencia() {
        this.listaCompetencias = new HashSet<>();
    }

    public boolean existeCompetencia(Competencia competencia) {
        return listaCompetencias.contains(competencia);
    }

    public void agregarCompetencia(Competencia competencia) {
        listaCompetencias.add(competencia);
    }

    public Competencia buscarCompetenciaPorNombre(String nombre) {
        for (Competencia competencia : listaCompetencias) {
            if (competencia.getNombre().equalsIgnoreCase(nombre)) {
                return competencia;
            }
        }
        return null;
    }

    public boolean eliminarCompetencia(String nombre) {
        Competencia competencia = buscarCompetenciaPorNombre(nombre);
        if (competencia != null) {
            return listaCompetencias.remove(competencia);
        }
        return false;
    }
}
