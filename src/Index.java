import java.util.ArrayList;
import java.util.Map;

public class Index {
    static void main(String[] args) throws Exception {

       ExampleMapOfEdges exampleMapOfEdges = new ExampleMapOfEdges();
       Map<Integer, ArrayList<Integer>> mapOfEdges = exampleMapOfEdges.initializeMap();
       TabuMap tabumap = null;
       Map<Integer, Integer> solutionmap = null;
       SolutionMatrix s = new SolutionMatrix(solutionmap);
       Map<Integer, Integer> solutionMap;

       Actions actions = new Actions(mapOfEdges, s, tabumap);

       solutionMap = actions.initializeColoring();

       System.out.println(solutionMap.size());




    }
}
