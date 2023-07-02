package sorter.impl;

import sorter.Sorter;

public class InsertionSorter implements Sorter {

    @Override
    public void sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }
}
