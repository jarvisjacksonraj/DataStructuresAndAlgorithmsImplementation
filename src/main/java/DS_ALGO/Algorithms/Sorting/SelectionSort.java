package DS_ALGO.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort<T> {
    static Util obj = new Util();

    @SuppressWarnings("unchecked")
    public void selectionSort(List<T> arr, int arrSize) {
        int minInd;
        for (int i = 0; i < arrSize; i++) {
            minInd = obj.findMax(arr, i, arrSize - 1);
            obj.swap(arr, i, minInd);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(5, 4, 1, 0, 5, 95, 4, -100, 200, 0));
        List<Character> arrayCharacter = new ArrayList<>(Arrays.asList('v', 'a', 'g', 's', 'h', 'q', 'r', 'z'));

        int arrSize = 10;
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        SelectionSort<Character> selectionSort2 = new SelectionSort<>();

        selectionSort.selectionSort(arrayIntegers, arrSize);
        selectionSort2.selectionSort(arrayCharacter, 8);

        obj.printArray(arrayCharacter, 8);
        obj.printArray(arrayIntegers, arrSize);

    }
}
