package modelo;

/**
 *
 * @author Víctor Andrés Rojas
 */
public class Punto {

    private Double x;
    private Double y;

    public Punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
