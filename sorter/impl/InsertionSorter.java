package sorter.impl;

import sorter.Sorter;

public class InsertionSorter implements Sorter {

    @Override
    public void sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int currentI = inputArray[i];
            int pt;
            for (pt = i; ((pt > 0) && (inputArray[pt - 1] > currentI)); pt--) {
                inputArray[pt] = inputArray[pt - 1];
            }
            inputArray[pt] = currentI;
        }
    }
}
