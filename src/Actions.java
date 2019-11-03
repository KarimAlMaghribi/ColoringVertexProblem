import java.lang.reflect.Array;
import java.util.*;

public class Actions {

    int v; // number of vertex
    int e; // number of edges
    Map<Integer, ArrayList<Integer>> mapOfEdges = new HashMap<>();
    Map<Integer, Integer> mapSolutionEdges = new HashMap<>();

    Colors c = new Colors(this.v);
    SolutionMatrix s;
    TabuMap t;

    public Actions(Map<Integer, ArrayList<Integer>> mapOfEdges, SolutionMatrix s, TabuMap t ){
        this.mapOfEdges = mapOfEdges;
        this.s = s;
        this.t = t;
        this.mapSolutionEdges = s.map;
    }

    public Map<Integer, Integer> initializeColoring() throws Exception {

        int currentVertex;
        int edgeNeighbour = 0;

        ArrayList<Integer> neighbourList;

        // iterate the map of Edges
        for(Map.Entry<Integer, ArrayList<Integer>> entry : mapOfEdges.entrySet()){

            //get current iterated vertex
            currentVertex = entry.getKey();

            // iterate vertex neighbourhood - Array
            for ( int nameOfNeighbour : entry.getValue()) {

                // looking wether neighbour is colored or not
                if(!s.lookForElement(nameOfNeighbour)){
                        edgeNeighbour = nameOfNeighbour;

                    // for each neighbour, search for next neighbours

                    neighbourList = mapOfEdges.get(edgeNeighbour);

                    // now looking, weather, and if so, which color BY EACH Neighbour was been giving in Tabu Map.
                    // Add Colors in ArrayList ( integer )
                    ArrayList<Integer> colorList = new ArrayList<>();
                    for (int neighbourIterator : neighbourList) {
                        if (t.lookForElement(neighbourIterator)) {
                            colorList.add(t.getColoringOfElement(neighbourIterator));
                        }
                    }

                    // create random color between 0 and k, not using the colors of the List

                    int i = 0;
                    boolean testObject = false;
                    int randomIntcolor = 0;
                    while (i<1){

                        //create random number
                        Random randomGenerator = new Random();
                        randomIntcolor = randomGenerator.nextInt(v-1) + 1;

                        //iterating over colorlist and looking for equality
                        for (int c: colorList ){
                            if( c == randomIntcolor){
                                testObject = false;
                            } else {
                                testObject = true;
                            }
                        }

                        // if color is a new color, we can color the vertex, if not, we generate a color again
                        if (testObject == true){
                            i ++;
                        } else {
                            continue;
                        }
                    }

                    // now we have a new color for the vertex

                    int [] insertObject = {nameOfNeighbour, randomIntcolor};
                    mapSolutionEdges.replace(nameOfNeighbour, randomIntcolor);
                    t.insertElement(insertObject);
                    s.insertElement(insertObject);

                }

            }
        }
        return mapSolutionEdges;
    }
}
