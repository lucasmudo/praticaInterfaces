import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(4);
        System.out.println(quadrado.getNome());
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println();

        Forma retangulo = new Retangulo(9, 8);
        System.out.println(retangulo.getNome());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Comparação: " + retangulo.comparar(quadrado));
        System.out.println();

        Circulo circulo = new Circulo(3);
        System.out.println(circulo.getNome());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println();

        Triangulo triangulo = new Triangulo(9);
        System.out.println(triangulo.getNome());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println();

        Casa casa = new Casa();
        Forma quarto = new Quadrado("Quarto: ", 5);
        Forma banheiro = new Triangulo("Banheiro: ", 7);
        Forma sala = new Retangulo("Sala: ", 8, 9);
        Forma cozinha = new Circulo("Cozinha: ", 6);

        casa.adicionarComodo(quarto);
        casa.adicionarComodo(sala);
        casa.adicionarComodo(quarto);
        casa.adicionarComodo(banheiro);
        casa.adicionarComodo(cozinha);

        System.out.println("Área total da casa: " + casa.calcularArea());
        System.out.println();

        System.out.println("Lista de cômodos");
        for (Forma comodo : casa.getListaComodos()) {
            System.out.println(comodo.getNome() + ": " + comodo.calcularArea());
        }

        System.out.println();
        System.out.println("Lista ordenada");
        casa.getListaComodos().sort(Forma::comparar);
        for (Forma comodo : casa.getListaComodos()) {
            System.out.println(comodo.getNome() + ": " + comodo.calcularArea());
        }


    }
}
