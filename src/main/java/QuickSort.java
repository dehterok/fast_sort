import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] array, int low, int high) {
        if (array.length == 0) //end if arrlen 0
            return;

        if (low >= high) //end if nothing to div
            return;

        // choose main el
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // div on subarr
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // call of recursion to sort left and right
        if (low < j)
           sort(array, low, j);

        if (high > i)
           sort(array, i, high);
    }
}