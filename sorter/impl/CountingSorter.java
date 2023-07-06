package sorter.impl;

import sorter.Sorter;

public class CountingSorter implements Sorter {

    @Override
    public void sort(int[] inputArray) {
        int[] quantityContainsNumber = new int[1000];
        for (int i = 0; i < inputArray.length; i++) {
            quantityContainsNumber[inputArray[i]] += 1;
        }
        int pt=0;
        for (int i = 0; i < quantityContainsNumber.length; i++) {
            for (int j = 0; j < quantityContainsNumber[i]; j++) {
                inputArray[pt]=i;
                pt+=1;
            }
        }
    }
}
