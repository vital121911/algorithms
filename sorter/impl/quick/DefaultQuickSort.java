package sorter.impl.quick;

import sorter.Sorter;

public class DefaultQuickSort implements Sorter<int[]> {

    @Override
    public void sort(int[] inputArray) {
        quickSort(inputArray,0,inputArray.length);
    }

    private void quickSort(int[] array, int left, int right) {
        if (right-left<=1){
            return;
        }
        int partition = partitionIndex(array, left, right);
        quickSort(array,left,partition);
        quickSort(array,partition,right);
    }

    private int partitionIndex(int[] array, int left, int right) {
        int leftIndex=left;
        int rightIndex=right-1;
        int median=array[rightIndex];
        while (leftIndex<=rightIndex){
            while (array[leftIndex]<median){
                leftIndex++;
            }
            while (array[rightIndex]>median){
                rightIndex--;
            }
            if (leftIndex<rightIndex){
                array[leftIndex]^=array[rightIndex];
                array[rightIndex]^=array[leftIndex];
                array[leftIndex]^=array[rightIndex];
                leftIndex++;
                rightIndex--;
            }else {
                break;
            }
        }
        return leftIndex;

    }
}
