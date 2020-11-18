import java.util.ArrayList;
import java.util.List;

public class Casa implements IAreaCalculavel,IComparavel {

    private List<Forma> listaComodos = new ArrayList<Forma>();


    public void adicionarComodo(Forma comodo){
        listaComodos.add(comodo);
    }

    public List<Forma> getListaComodos() {
        return listaComodos;
    }

    @Override
    public double calcularArea() {
        double area=0;

        for (Forma comodo : listaComodos) {
            area+= comodo.calcularArea();
        }

        return area;
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
