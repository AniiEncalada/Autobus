package vista;

import controlador.OperacionesLambda;

/**
 *
 * @author Víctor Andrés Rojas
 */
public class Ejecutar {

    public static void main(String[] args) {
        OperacionesLambda operacion = new OperacionesLambda();
        operacion.cargarListaRuta();
        operacion.recorrerListaRuta();
        operacion.calcularTotal();
        System.out.println("Resultados: " + operacion.resultados());
       // System.out.println("El menor recorrido es: " + operacion.menorRecorrido(operacion.resultados()));
    operacion.menorRecorrido(operacion.resultados());
    }
}
