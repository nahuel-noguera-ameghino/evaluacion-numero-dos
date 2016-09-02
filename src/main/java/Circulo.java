/**
 * Created by alumno on 02/09/16.
 */
public class Circulo {
    int radio;
    public Circulo(int radio){
        radio= this.radio;
    }

    public double area() {
        return(Math.PI*(Math.pow(this.radio,2))) ;
    }

    public double perimetro() {
        return (Math.PI * this.radio);
    }
}
