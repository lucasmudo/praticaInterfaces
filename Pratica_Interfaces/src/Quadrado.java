public class Quadrado extends Forma{
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado= lado;
    }


    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }


}
