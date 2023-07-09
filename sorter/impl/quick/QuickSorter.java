package sorter.impl.quick;

import sorter.Sorter;

import java.util.Random;

public class QuickSorter implements Sorter<int[]> {

    private final Random random = new Random();

    @Override
    public void sort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int median = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= median) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }


//[1,3,5,6,2]

    private int median(int[] array, int left, int right) {
        System.out.println("median for left " + left + " right " + right);
        for (int i = left; i < right; i++) {
            System.out.print(array[i] + ",");
        }
        int i = array[left + random.nextInt(right - left)];
        System.out.println("MEDIAN " + i);
        return i;
    }
}
