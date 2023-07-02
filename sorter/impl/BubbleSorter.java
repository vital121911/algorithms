package sorter.impl;

import sorter.Sorter;

public class BubbleSorter implements Sorter {

    @Override
    public void sort(int[] inputArray) {
        boolean isNotSorted = true;
        for (int i = 0; i < inputArray.length && isNotSorted; i++) {
            isNotSorted = false;
            for (int j = 0; (j < inputArray.length - 1 - i); j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    isNotSorted = true;
                }
            }
        }
    }

}
