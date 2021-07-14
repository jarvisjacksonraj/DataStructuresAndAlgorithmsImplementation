package DS_ALGO.Algorithms.Sorting;

import java.util.List;

public class Util<T extends Comparable<T>> {

    void printArray(List<T> arr, int arrSize) {
        for (int i = 0; i < arrSize; i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }

    void swap(List<T> array, int firstIndex, int secondIndex) {
        T temp = array.get(firstIndex);
        array.set(firstIndex, array.get(secondIndex));
        array.set(secondIndex, temp);
    }

    int findMin(List<T> arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int minInd = start;
        int comparedValue;
        for (int i = start + 1; i <= end; i++) {
            comparedValue = arr.get(minInd).compareTo(arr.get(i));
            if (comparedValue > 0)
                minInd = i;
        }
        return minInd;
    }

    int findMax(List<T> arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int maxInd = start;
        int comparedValue;
        for (int i = start + 1; i <= end; i++) {
            comparedValue = arr.get(maxInd).compareTo(arr.get(i));
            if (comparedValue < 0)
                maxInd = i;
        }
        return maxInd;
    }
}
