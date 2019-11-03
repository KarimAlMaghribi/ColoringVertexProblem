import java.lang.reflect.Array;

public class Colors {
    int[] color;
    public Colors ( int size_k_vertex) {
       this.color = this.fill_constructor(size_k_vertex);
    }

    // Für das Vertex Coloring eines Graphen wird ein Set aus k-Farben, gleich der Anzahl der Knoten vorbereitet.
    private int[] fill_constructor (int size_k_vertex) {
        int [] color = new int[size_k_vertex];
        for (int i = 0; i< size_k_vertex; i++ ){

            color[i] = i+1;
            i++;
        }

        return color;

    }


}
