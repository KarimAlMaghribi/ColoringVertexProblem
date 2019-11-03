import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    // Ein Graph ist eine Struktur eines finiten Sets V ( für Vertex, also die Ecken, bzw. Knoten)
    // und eines finiten Sets E ( die Edges also die Kanten ).

    int v;
    int e;
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();

    public Graph(int v, int e, Map<Integer, ArrayList<Integer>> map) {
        this.v = v;
        this.e = e;
        this.map = map;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Map<Integer, ArrayList<Integer>> getMap() {
        return map;
    }

    public void addToGraph(int[] vertex_combination){
        if (vertex_combination.length == 2){

            if ( map.containsKey(vertex_combination[0])){

                ArrayList<Integer> value = map.get(vertex_combination[0]);
                value.add(vertex_combination[1]);
                map.replace(vertex_combination[0], value);

            } else {

                ArrayList<Integer> value = new ArrayList<>();
                value.add(vertex_combination[1]);
                map.put(vertex_combination[0], value);

            }

        }
    }

    public void setMap(Map<Integer, ArrayList<Integer>> map) {
        this.map = map;
    }
}
