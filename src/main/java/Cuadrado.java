import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado {
    public int lado;

    public Cuadrado(int i) {
        this.lado = i;
    }

    public double sumarAreasDeFiguras(List<Figura> rectangulos) {
        double sum=0;
        for (Figura r: rectangulos){
            sum=sum+ r.area();
        }
        return sum;
    }

    public double area() {
        int areaT= lado * lado;
        return areaT();
    }

    private double areaT() {
        return areaT();
    }


    public double perimetro() {
        double Perimetro= lado * 4;
        return Perimetro;
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sum=0;
        for (Cuadrado j: cuadrados){
            sum=sum+ j.area();
        }
        return sum;
    }
}



