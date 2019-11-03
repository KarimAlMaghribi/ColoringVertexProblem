import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExampleMapOfEdges {

    Map<Integer, ArrayList<Integer>> mapOfEdges = new HashMap<>();

    ArrayList<Integer> one = new ArrayList<>();
    ArrayList<Integer> two = new ArrayList<>();
    ArrayList<Integer> three = new ArrayList<>();
    ArrayList<Integer> four = new ArrayList<>();
    ArrayList<Integer> five = new ArrayList<>();
    ArrayList<Integer> six = new ArrayList<>();
    ArrayList<Integer> seven = new ArrayList<>();
    ArrayList<Integer> eight = new ArrayList<>();
    ArrayList<Integer> nine = new ArrayList<>();
    ArrayList<Integer> ten = new ArrayList<>();



    public Map<Integer, ArrayList<Integer>> initializeMap () {
        one.add(2);
        one.add(4);
        one.add(7);
        one.add(9);

        mapOfEdges.put(1, one);

        two.add(3);
        two.add(6);
        two.add(8);

        mapOfEdges.put(2, two);

        three.add(5);
        three.add(7);
        three.add(10);

        mapOfEdges.put(3, three);

        four.add(5);
        four.add(6);
        four.add(10);

        mapOfEdges.put(4, three);

        five.add(8);
        five.add(9);

        mapOfEdges.put(5, three);

        six.add(11);

        mapOfEdges.put(6, three);

        seven.add(11);

        mapOfEdges.put(7, three);

        eight.add(11);

        mapOfEdges.put(8, three);

        nine.add(11);

        mapOfEdges.put(9, three);

        ten.add(11);

        mapOfEdges.put(10, three);

        return mapOfEdges;

    }

}
