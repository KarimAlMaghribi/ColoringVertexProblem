import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabuMap {

    int v; // vertex
    int i; // coloring

    Map<Integer, Integer> map = new HashMap<>();


    public TabuMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public void insertElement (int[] vertexcoloring) throws Exception {

        if ( vertexcoloring.length == 2 ) {

            map.put(vertexcoloring[0], vertexcoloring[1]);

        } else throw (new Exception("Wrong configuration of vertex coloring"));

    }

    public void eraseElement ( int keyVertex ) throws Exception {

        if ( map.containsKey( keyVertex )){
            map.remove(keyVertex);
        } else {
            throw (new Exception("No such Vertex in TabuMap"));
        }

    }

    public int[] searchForELement ( int keyVertex) throws Exception {

        int [] vertexColoring = new int[2];

        if ( map.containsKey( keyVertex )){
            vertexColoring[0] = keyVertex;
            vertexColoring[1] = map.get(keyVertex);
        } else {
            throw (new Exception("No such Vertex in TabuMap"));
        }
        return vertexColoring;
    }
}
