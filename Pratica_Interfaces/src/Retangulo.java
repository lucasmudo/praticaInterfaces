public class Retangulo extends Forma {
    private double lado1;
    private double lado2;


    public Retangulo(String nome, double lado1, double lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(double lado1, double lado2) {
        super("Retangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }


}
