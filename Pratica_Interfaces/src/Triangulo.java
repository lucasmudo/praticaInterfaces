public class Triangulo extends Forma{
    private double lado;

    public Triangulo(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    public Triangulo(double lado) {
        super("Triângulo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }

    @Override
    public double calcularPerimetro() {
        return lado*3;
    }


}
