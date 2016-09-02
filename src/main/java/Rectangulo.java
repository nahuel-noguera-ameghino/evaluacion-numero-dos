import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea() {
        return 0;
    }

    public double area() {
        int areaT= base * altura;
        return areaT;

    }

    public double perimetro() {
        double Perimetro= base *2 + altura*2;
        return Perimetro;
    }
    }
