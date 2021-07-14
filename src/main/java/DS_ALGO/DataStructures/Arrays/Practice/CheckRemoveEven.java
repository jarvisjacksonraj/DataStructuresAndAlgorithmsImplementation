package DS_ALGO.DataStructures.Arrays.Practice;

public class CheckRemoveEven {

    //Time Complexity O(n)

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;

        //Find Number of odd in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) oddCount++;
        }

        int result[] = new int[oddCount];

        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[oddIndex++] = arr[i];
            }
        }
        return result;
    }
}
