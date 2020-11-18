public abstract class Forma implements IAreaCalculavel, IPerimetroCalculavel, IComparavel {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int comparar(IComparavel comparavel) {
        if (this.calcularArea() < comparavel.calcularArea()) {
            return -1;
        } else if (this.calcularArea() == comparavel.calcularArea()) {
            return 0;
        } else{
            return 1;
        }
    }
}
