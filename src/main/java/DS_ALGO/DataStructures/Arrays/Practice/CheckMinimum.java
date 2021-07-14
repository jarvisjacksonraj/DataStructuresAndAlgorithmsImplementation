package DS_ALGO.DataStructures.Arrays.Practice;

public class CheckMinimum {
    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        return min;
    }
}
