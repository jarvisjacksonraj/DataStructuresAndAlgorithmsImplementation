package DS_ALGO.DataStructures.Arrays.Practice;

public class CheckMergeArray {

    //Time Complexity O(n+m)


    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int resultArrayLength = arr1.length + arr2.length;
        int array1Length = arr1.length;
        int array2Length = arr2.length;

        int resultArray[] = new int[resultArrayLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1Length && j < array2Length) {
            if (arr1[i] < arr2[j]) {
                resultArray[k++] = arr1[i++];
            } else {
                resultArray[k++] = arr2[j++];
            }
        }

        while (i < array1Length) {
            resultArray[k++] = arr1[i++];

        }
        while (j < array2Length) {
            resultArray[k++] = arr2[j++];

        }
        return resultArray;
    }
}