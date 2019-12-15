package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import modelo.Punto;
import modelo.Ruta;

/**
 *
 * @author Víctor Andrés Rojas
 */
public class OperacionesLambda {

    List<Ruta> listaRuta = new ArrayList<>();

    public List<Ruta> getListaRuta() {
        return listaRuta;
    }

    public void cargarListaRuta() {
        Ruta ruta = new Ruta();
        ruta.getListaPunto().add(new Punto(5.0, 5.1));
        ruta.getListaPunto().add(new Punto(4.5, 8.0));
        ruta.getListaPunto().add(new Punto(6.3, 10.0));
        ruta.getListaPunto().add(new Punto(4.3, 9.0));
        ruta.setnRuta("ruta 1");
        listaRuta.add(ruta);

        Ruta ruta2 = new Ruta();
        ruta2.getListaPunto().add(new Punto(3.03, 2.0));
        ruta2.getListaPunto().add(new Punto(6.5, 1.6));
        ruta2.getListaPunto().add(new Punto(6.3, 9.0));
        ruta2.getListaPunto().add(new Punto(7.3, 6.0));
        ruta2.setnRuta("ruta 2");
        listaRuta.add(ruta2);

        Ruta ruta3 = new Ruta();
        ruta3.getListaPunto().add(new Punto(3.0, 4.01));
        ruta3.getListaPunto().add(new Punto(6.5, 5.0));
        ruta3.getListaPunto().add(new Punto(2.3, 6.3));
        ruta3.getListaPunto().add(new Punto(5.3, 6.1));
        ruta.setnRuta("ruta 3");
        listaRuta.add(ruta3);
    }

    public void recorrerListaRuta() {
        listaRuta.forEach(System.out::println);
    }

    private Double calcular(List<Punto> lista) {
        Double resultado = 0.00;
        for (int i = 0; i < lista.size() - 1; i++) {
            resultado += calcularDistancia(lista.get(i), lista.get(i + 1));
        }
        return resultado;
    }

    public void calcularTotal() {
        for (Ruta ruta : listaRuta) {
            ruta.setRecorrido(calcular(ruta.getListaPunto()));
        }
    }

    public List<Double> resultados() {
        return listaRuta.stream().map(x -> x.getRecorrido()).collect(Collectors.toList());
    }

    public void menorRecorrido(List<Double> lista) {
        lista.sort((a, b) -> a.compareTo(b));
        System.out.println("la distancia menor es: "+ lista.get(0)+"\n"+ lista.toString()+"  "+
                listaRuta.get(0).getnRuta());
    }

    public Double calcularDistancia(Punto puntoA, Punto puntoB) {
        Distancia dis = (a, b) -> {
            Double aux = Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2);
            return Math.sqrt(aux);
        };
        return dis.distancia(puntoA, puntoB);
    }

    @FunctionalInterface
    public interface Distancia {

        public Double distancia(Punto puntoA, Punto puntoB);
    }
}
