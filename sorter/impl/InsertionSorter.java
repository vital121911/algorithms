package sorter.impl;

import sorter.Sorter;

import java.util.Arrays;

public class InsertionSorter implements Sorter {

    @Override
    public void sort(int[] inputArray) {
        System.out.println("START"+ Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length; i++) {
            int temp=inputArray[i];
            System.out.println("I"+i);
            int pt;
            for (pt = i; ((pt>0)&&(inputArray[pt-1]>temp)); pt--) {
                System.out.println("pt"+pt);
                inputArray[pt]=inputArray[pt-1];
                System.out.println(Arrays.toString(inputArray));
            }
            inputArray[pt]=temp;
        }
    }
}
