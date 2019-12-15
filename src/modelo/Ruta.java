package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Víctor Andrés Rojas
 */
public class Ruta {

    private Double recorrido;
    private List<Punto> listaPunto = new ArrayList<>();
    private String nRuta;

    public String getnRuta() {
        return nRuta;
    }

    public void setnRuta(String nRuta) {
        this.nRuta = nRuta;
    }
    
    public Double getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Double recorrido) {
        this.recorrido = recorrido;
    }

    public List<Punto> getListaPunto() {
        return listaPunto;
    }

    public void setListaPunto(List<Punto> listaPunto) {
        this.listaPunto = listaPunto;
    }

    @Override
    public String toString() {
        return listaPunto + " " +nRuta;
    }
}
