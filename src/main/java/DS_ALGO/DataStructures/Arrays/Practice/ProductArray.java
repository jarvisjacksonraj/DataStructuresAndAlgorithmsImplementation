package DS_ALGO.DataStructures.Arrays.Practice;

public class ProductArray {

    public static int[] findProduct(int numArray[]) {

        int[] result = new int[numArray.length];
        int tempProduct = 1;

        /*
        10  3   5   6   2
        0   1   2   3   4

        //left          0   1   2   3   4
        Result[i]   =   1   10  30  150 900
        tempProduct =   10  30  150 900 1200
        */

        for (int i = 0; i < numArray.length; i++) {
            result[i] = tempProduct;
            tempProduct = tempProduct * numArray[i];
        }

        /*
        10  3   5   6   2
        0   1   2   3   4
        //right
        Result[i]   =   1   10  30  150 600

        //right         4   3   2   1   0
        Result[i]   =   900 300 360 600 180
        tempProduct =   2   12  60  180 1800
         */

        tempProduct = 1;

        for (int i = numArray.length - 1; i >= 0; i--) {
            result[i]  *= tempProduct;
            tempProduct *= numArray[i];
        }

        return result;
    }
}
