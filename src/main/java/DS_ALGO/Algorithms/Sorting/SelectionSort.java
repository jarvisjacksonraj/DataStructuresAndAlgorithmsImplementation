package DS_ALGO.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort<T> {
    static Util obj = new Util();

    public void selectionSort(List<T> arr, int arrSize) {
        int minInd;
        for (int i = 0; i < arrSize; i++) {
            minInd = obj.findMax(arr, i, arrSize - 1);
            obj.swap(arr, i, minInd);
        }
    }

}
