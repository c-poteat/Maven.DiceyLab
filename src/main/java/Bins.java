import java.util.HashMap;
import java.util.Map;

public class Bins {

    /* Create a hashMap for tracking purposes
     Collecting the results of each toss
     Example key 2  value  # of times rolled 2
    */

    // setting up the hashmap , instance variable for the class
    private Map<Integer, Integer> results;

    // constructor makes a new Hashmap and assigns it to "results" variable (of Map type - a generic typ)
    public Bins(Map<Integer, Integer> results) {
        this.results = new HashMap<Integer, Integer>();
    }

    public void addDiceRollResultToMap(Integer resultvalue, Integer numRollsOfThatValue) {
        results.put(resultvalue, numRollsOfThatValue);

        // TODO - put check in if result is within 2 - 12 range
    }
}