import java.util.*;

public class TrianguloEquilatero extends FiguraGeometrica{
    
    private double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor, totalFiguras, totalFiguras);
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public String getTipoFigura(){
        return "Triangulo equilatero";
    }
     @Override
    public double calcularPerimetro(){
        return 3*lado;
    }
     @Override
    public double calcularArea(){
        return (Math.sqrt(3/4)* Math.pow(lado,2));
    }

}