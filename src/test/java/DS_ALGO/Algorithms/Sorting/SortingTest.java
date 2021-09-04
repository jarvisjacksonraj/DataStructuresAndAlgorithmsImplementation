package DS_ALGO.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SortingTest {
    @SuppressWarnings("unchecked")
    @Test
    public void testSelectionSort() {
        Util obj = new Util();

        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(5, 4, 1, 0, 5, 95, 4, -100, 200, 0));
        List<Character> arrayCharacter = new ArrayList<>(Arrays.asList('v', 'a', 'g', 's', 'h', 'q', 'r', 'z'));
        List<String> arrayString = new ArrayList<>(Arrays.asList("Jackson", "Raj", "Aron", "Merlin"));

        final int arrSize[] = new int[]{10, 8, 4};
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        SelectionSort<Character> selectionSort2 = new SelectionSort<>();
        SelectionSort<String> selectionSort3 = new SelectionSort<>();

        selectionSort.selectionSort(arrayIntegers, arrSize[0]);
        selectionSort2.selectionSort(arrayCharacter, arrSize[1]);
        selectionSort3.selectionSort(arrayString, arrSize[2]);


        obj.printArray(arrayIntegers, arrSize[0]);
        obj.printArray(arrayCharacter, arrSize[1]);
        obj.printArray(arrayString, arrSize[2]);

    }
}
