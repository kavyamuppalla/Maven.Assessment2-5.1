package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        ArrayList<String> arrl = new ArrayList<String>(Arrays.asList(arrayToBeSpliced));
        arrl.add(arrayToBeSpliced.toString());
        List<String> list = arrl.subList(startingIndex, endingIndex);
        return list.toArray(new String[]{});
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> list = new ArrayList<>(Arrays.asList(arrayToBeSpliced));
        list.get(startingIndex);
        return list.toArray(new String[]{});
    }
}
