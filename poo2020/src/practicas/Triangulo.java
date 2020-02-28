package practicas;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        area = (base * altura)/2;
        return area;
    }
}
