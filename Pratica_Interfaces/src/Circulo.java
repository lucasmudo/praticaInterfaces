public class Circulo extends Forma{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(raio,2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return raio * 2 * Math.PI;
    }


}
